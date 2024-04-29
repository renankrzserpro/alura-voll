CREATE TABLE doctors (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    specialty VARCHAR(100) NOT NULL,
    street_address VARCHAR(100) NOT NULL,
    address_line_2 VARCHAR(100),
    city VARCHAR(100) NOT NULL,

    PRIMARY KEY(ID)
);
