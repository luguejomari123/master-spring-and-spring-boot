INSERT INTO user_details(id,birth_date,name)
VALUES(10001, current_date(), 'jom');

INSERT INTO user_details(id,birth_date,name)
VALUES(10002, current_date(), 'dog');

INSERT INTO user_details(id,birth_date,name)
VALUES(10003, current_date(), 'yabu');

INSERT INTO post(id,description,user_id)
VALUES(20001, 'I like turtles', 10001);

INSERT INTO post(id,description,user_id)
VALUES(20002, 'I like shorts, they''re comfy and easy to wear', 10002);

INSERT INTO post(id,description,user_id)
VALUES(20003, 'Sike', 10003);