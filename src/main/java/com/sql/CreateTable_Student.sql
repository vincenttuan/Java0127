Create TABLE Student (
    id integer NOT NULL,
    name varchar(20),
    score integer NOT NULL,
    ts timestamp default current_timestamp,
    classroom_id integer,
    CONSTRAINT classroom_id_FK Foreign Key (classroom_id) REFERENCES Classroom (id),
    PRIMARY KEY(id)
)

