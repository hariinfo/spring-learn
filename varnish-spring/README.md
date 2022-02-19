## Usage

Navigate to docker folder and run following command.

```docker compose up```

To validate the varnish log, first grab the docker id by running this command `docker ps`.
Next, login to the docker shell for varnish `docker exec -it 0b6781045590 bash`.
Once logged in, execute this command to grep the request logs `varnishlog -q 'RespStatus == 200’ -g request`

Navigate to this URL in the browser `http://localhost:8090/home` and look for Response headers.
The X-Varnish-Cache: HIT, X-Varnish-Cache: MISS etc..