CREATE TABLE USER(
    ID bigint not null,
    NAME varchar(50) not null,
    LAST_NAME varchar(11) not null,
    BIRTHDAY date not null,
    USER_TYPE varchar(50) not null,
    PRIMARY KEY (ID)
);

CREATE TABLE ATTRACTION(
     ID bigint not null,
     NAME varchar(11) not null,
     DESCRIPTION varchar(256) not null,
     DATE date not null,
     LOCATION varchar(256) not null,
     USER_ID bigint not null,
     PRIMARY KEY (ID),
     CONSTRAINT FK_USER_ID FOREIGN KEY (USER_ID) REFERENCES USER(ID),
);

CREATE TABLE ROADMAP(
   ID bigint not null,
   NAME varchar(11) not null,
   PRIMARY KEY (ID)
);

CREATE TABLE ROADMAP_ATTRACTIONS(
    ATTRACTION_ID bigint not null,
    ROADMAP_ID bigint not null,
);