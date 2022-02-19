vcl 4.1;

backend frontend-a {
  .host = "frontend-a";
  .port = "8080";
}

sub vcl_backend_response {
  set beresp.do_esi = true; // Do ESI processing
  set beresp.ttl = 5d;    // Sets the TTL
}

# Set a header to track a cache HIT/MISS.
sub vcl_deliver {
  if (obj.hits > 0) {
    set resp.http.X-Varnish-Cache = "HIT";
  }
  else {
    set resp.http.X-Varnish-Cache = "MISS";
  }
}


sub vcl_recv {
    if (req.method != "GET" && req.method != "HEAD") {
        return (pass);
    }
    return (hash);
}