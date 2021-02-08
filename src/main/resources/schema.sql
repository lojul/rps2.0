DROP TABLE IF EXISTS rps_plan_group;
DROP TABLE IF EXISTS member;

CREATE TABLE rps_plan_group (
                                id INT AUTO_INCREMENT  PRIMARY KEY,
                                plan_group VARCHAR(250) NOT NULL,
                                plan_group_desc VARCHAR(250) NOT NULL
);

CREATE TABLE member (
                                id INT AUTO_INCREMENT  PRIMARY KEY,
                                first_name VARCHAR(250) NOT NULL,
                                last_name VARCHAR(250) NOT NULL,
                                address VARCHAR(250) NOT NULL
);