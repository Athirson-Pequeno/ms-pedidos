INSERT INTO tb_users (name, email, password) VALUES ('Athirson', 'Athirson@gmail.com', '123456');
INSERT INTO tb_users (name, email, password) VALUES ('Karol', 'Karol@gmail.com', '123456');

INSERT INTO tb_role (role_name) VALUES ('ROLE_USER');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);