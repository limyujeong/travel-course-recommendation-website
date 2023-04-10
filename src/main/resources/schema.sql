CREATE TABLE city (
    city varchar(15),
    PRIMARY KEY (city)
);

CREATE TABLE travel (
    id int NOT NULL,
    courseName varchar(50) NOT NULL,
    city varchar(15) NOT NULL,
    night int NOT NULL,
    days int NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE detailCourse (
    spotNo int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    id int NOT NULL,
    courseName varchar(50) NOT NULL,
    dayy int NOT NULL,
    type varchar(15) NOT NULL,
    spotName varchar(500) NOT NULL,
    FOREIGN KEY (id) REFERENCES travel(id) ON DELETE CASCADE
);