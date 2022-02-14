create table if not exists room(
    examination_room_id INTEGER not null generated by default as identity primary key,
    blockfloor INTEGER,
    blockcode INTEGER,
    roomtype VARCHAR,
    available boolean
);

