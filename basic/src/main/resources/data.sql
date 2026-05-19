INSERT INTO article(title, content) VALUES ('리틀 트윈스타', '리틀트윈스타는 꿈별구름의 배려하기 별에서 태어난 쌍둥이 남매 별입니다.');
INSERT INTO article(title, content) VALUES ('마이멜로디', '마이멜로디는 밝고 명랑하며 남동생을 아끼는 여자아이예요.');
INSERT INTO article(title, content) VALUES ('포차코', '호기심 많은 참견쟁이로 산책을 좋아하는 남자 강아지예요.');
INSERT INTO article(title, content) VALUES ('한교동', '중국에서 태어난 반어인(半魚人). 사람을 웃게 하는 게 특기지만 사실은 외로움을 타는 로맨티스트.');
INSERT INTO article(title, content) VALUES ('폼폼푸린', '폼폼푸린은 진갈색의 베레모가 트레이드 마크인 골든 리트리버입니다.');
INSERT INTO article(title, content) VALUES ('쿠로미', '자칭 마이멜로디의 라이벌인 쿠로미.');

-- 4번 게시글 (한교동) 댓글 3개
INSERT INTO comment(article_id, nickname, body) VALUES (4, '산리오덕후', '한교동 외로움 많이 타는 거 너무 반전 매력이에요ㅠㅠ 감성 가득해!');
INSERT INTO comment(article_id, nickname, body) VALUES (4, '문어친구', '사람 웃기는 게 특기라니 한교동 덕분에 오늘도 웃고 간다 문어~');
INSERT INTO comment(article_id, nickname, body) VALUES (4, '로맨티스트', '반어인 중에서 제일 귀엽고 다정한 우리 교동이 주접 댓글 달고 갑니다.');

-- 5번 게시글 (폼폼푸린) 댓글 3개
INSERT INTO comment(article_id, nickname, body) VALUES (5, '초코푸딩', '폼폼푸린 진갈색 베레모 씌워준 사람 상 줘야 됨... 진짜 지구 뿌시게 귀엽다.');
INSERT INTO comment(article_id, nickname, body) VALUES (5, '골든댕댕이', '골든 리트리버였구나ㅋㅋㅋ 어쩐지 세상 무해하고 댕댕미 넘치더라니!');
INSERT INTO comment(article_id, nickname, body) VALUES (5, '마이구미', '푸린이 엉덩이에 별 모양 있는 것도 넣어주세요 현기증 난단 말이에요.');

-- 6번 게시글 (쿠로미) 댓글 3개
INSERT INTO comment(article_id, nickname, body) VALUES (6, '쿠로미짱', '자칭 라이벌이지만 마이멜로디 은근히 챙겨주는 츤데레 쿠로미 최고🖤');
INSERT INTO comment(article_id, nickname, body) VALUES (6, '블랙해골', '산리오의 힙함 담당은 역시 쿠로미지! 보라색 검은색 찰떡궁합.');
INSERT INTO comment(article_id, nickname, body) VALUES (6, '멜로디러버', '마이멜로디랑 쿠로미 둘 케미 평생 가자... 투닥거리는 거 너무 소중해.');

INSERT INTO member(email, password) VALUES ('1111@1111', '1111');
INSERT INTO member(email, password) VALUES ('2222@2222', '2222');
INSERT INTO member(email, password) VALUES ('3333@3333', '3333');
INSERT INTO member(email, password) VALUES ('4444@4444', '4444');
INSERT INTO member(email, password) VALUES ('5555@5555', '5555');
INSERT INTO member(email, password) VALUES ('6666@6666', '6666');

-- 11장 셀프체크 데이터 추가
INSERT INTO coffee(name, price) VALUES('아메리카노', '4500');
INSERT INTO coffee(name, price) VALUES('라떼', '5000');
INSERT INTO coffee(name, price) VALUES('카페 모카', '5500');