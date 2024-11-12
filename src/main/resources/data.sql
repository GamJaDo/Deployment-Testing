INSERT INTO USER_TB(email, password, name, profile_image_url, location)
VALUES ('a@naver.com', '$2a$10$/kIrh1IIxo60.jHaISACEOpyrb6/2KpgQYcfHlOJBDuFdl9KrOrBm', '일반회원1',
        'https://nurspace-bucket.s3.ap-northeast-2.amazonaws.com/default_profile.png',
        '강원특별자치도 춘천시 백령로 1');

INSERT INTO BODY_INFO_TB(user_id, inbody_image_url, create_date, deleted)
VALUES (1, 'https://nurspace-bucket.s3.ap-northeast-2.amazonaws.com/default_profile.png', NOW(),
        FALSE);

INSERT INTO SPORTS_TB(name, deleted)
VALUES ('PT', false);