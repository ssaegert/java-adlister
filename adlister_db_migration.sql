USE adlister_db;

DROP TABLE users;


CREATE TABLE users (
  id           INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username     VARCHAR(150) NOT NULL,
  email        VARCHAR(150) NOT NULL,
  password     VARCHAR(150) NOT NULL,
  PRIMARY KEY (id)
);

DROP TABLE ads;


CREATE TABLE ads (
  id         INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id    INT UNSIGNED NOT NULL,
  title      VARCHAR(150) NOT NULL,
  description TEXT,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
);