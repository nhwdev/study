package com.study.basic.repository;

import com.study.basic.entity.Article;
import com.study.basic.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Test
    @DisplayName("특정 게시글의 모든 댓글 조회")
    void findByArticleId() {
        /* Case 1: 4번 게시글의 모든 댓글 조회 */
        {
            // 1. 입력 데이터 준비
            Long articleId = 4L;
            // 2. 실제 데이터
            List<Comment> comments = commentRepository.findByArticleId(articleId);
            // 3. 예상 데이터
            Article article = new Article(4L, "한교동", "중국에서 태어난 반어인(半魚人). 사람을 웃게 하는 게 특기지만 사실은 외로움을 타는 로맨티스트.");
            Comment a = new Comment(1L, article, "산리오덕후", "한교동 외로움 많이 타는 거 너무 반전 매력이에요ㅠㅠ 감성 가득해!");
            Comment b = new Comment(2L, article, "문어친구", "사람 웃기는 게 특기라니 한교동 덕분에 오늘도 웃고 간다 문어~");
            Comment c = new Comment(3L, article,  "로맨티스트", "반어인 중에서 제일 귀엽고 다정한 우리 교동이 주접 댓글 달고 갑니다.");
            List<Comment> expected = Arrays.asList(a, b, c);
            // 4. 비교 및 검증
            assertEquals(expected.toString(), comments.toString(), "4번 글의 모든 댓글을 출력!");
        }
        /* Case 2: 1번 게시글의 모든 댓글 조회 */
        {
            // 1. 입력 데이터 준비
            Long articleId = 1L;
            // 2. 실제 데이터
            List<Comment> comments = commentRepository.findByArticleId(articleId);
            // 3. 예상 데이터
            Article article = new Article(1L, "리틀 트윈스타", "리틀트윈스타는 꿈별구름의 배려하기 별에서 태어난 쌍둥이 남매 별입니다.");
            List<Comment> expected = Arrays.asList();
            // 4. 비교 및 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글이 없음");
        }
        /* Case 3: 9번 게시글의 모든 댓글 조회 */
        {
            // 1. 입력 데이터 준비
            Long articleId = 9L;
            // 2. 실제 데이터
            List<Comment> comments = commentRepository.findByArticleId(articleId);
            // 3. 예상 데이터
            Article article = null;
            List<Comment> expected = Arrays.asList();
            // 4. 비교 및 검증
            assertEquals(expected.toString(), comments.toString(), "9번 글 자체가 없으므로, 댓글은 비어 있어야 함");
        }
        /* Case 4: 999번 게시글의 모든 댓글 조회 */
        {
            // 1. 입력 데이터 준비
            Long articleId = 999L;
            // 2. 실제 데이터
            List<Comment> comments = commentRepository.findByArticleId(articleId);
            // 3. 예상 데이터
            Article article = null;
            List<Comment> expected = Arrays.asList();
            // 4. 비교 및 검증
            assertEquals(expected.toString(), comments.toString(), "999번 글 자체가 없으므로, 댓글은 비어 있어야 함");
        }
        /* Case 5: -1번 게시글의 모든 댓글 조회 */
        {
            // 1. 입력 데이터 준비
            Long articleId = -1L;
            // 2. 실제 데이터
            List<Comment> comments = commentRepository.findByArticleId(articleId);
            // 3. 예상 데이터
            Article article = null;
            List<Comment> expected = Arrays.asList();
            // 4. 비교 및 검증
            assertEquals(expected.toString(), comments.toString(), "-1번 글 자체가 없으므로, 댓글은 비어 있어야 함");
        }
    }

    @Test
    @DisplayName("특정 닉네임의 모든 댓글 조회")
    void findByNickname() {
        /* Case 1: "마이구미"의 모든 댓글 조회 */
        {
            // 1. 입력 데이터 준비
            String nickName = "마이구미";
            // 2. 실제 데이터
            List<Comment> comments = commentRepository.findByNickname(nickName);
            // 3. 예상 데이터
            Comment a = new Comment(6L, new Article(5L, "폼폼푸린", "폼폼푸린은 진갈색의 베레모가 트레이드 마크인 골든 리트리버입니다."), nickName, "푸린이 엉덩이에 별 모양 있는 것도 넣어주세요 현기증 난단 말이에요.");
            List<Comment> expected = List.of(a);
            // 4. 비교 및 검증
            assertEquals(comments.toString(), expected.toString(), "폼폼푸린의 모든 댓글을 출력!");
        }
        /* Case 2: "산리오덕후"의 모든 댓글 조회 */
        {
            // 1. 입력 데이터 준비
            String nickName = "산리오덕후";
            // 2. 실제 데이터
            List<Comment> comments = commentRepository.findByNickname(nickName);
            // 3. 예상 데이터
            Comment a = new Comment(1L, new Article(4L, "한교동", "중국에서 태어난 반어인(半魚人). 사람을 웃게 하는 게 특기지만 사실은 외로움을 타는 로맨티스트."), nickName, "한교동 외로움 많이 타는 거 너무 반전 매력이에요ㅠㅠ 감성 가득해!");
            List<Comment> expected = List.of(a);
            // 4. 비교 및 검증
            assertEquals(comments.toString(), expected.toString(), "산리오덕후의 모든 댓글을 출력!");
        }
        /* Case 3: null의 모든 댓글 조회 */
        {
            // 1. 입력 데이터 준비
            String nickName = null;
            // 2. 실제 데이터
            List<Comment> comments = commentRepository.findByNickname(nickName);
            // 3. 예상 데이터
            List<Comment> expected = Arrays.asList();
            // 4. 비교 및 검증
            assertEquals(comments.toString(), expected.toString(), "null의 모든 댓글을 출력!");
        }
        /* Case 4: ""의 모든 댓글 조회 */
        {
            // 1. 입력 데이터 준비
            String nickName = "";
            // 2. 실제 데이터
            List<Comment> comments = commentRepository.findByNickname(nickName);
            // 3. 예상 데이터
            List<Comment> expected = Arrays.asList();
            // 4. 비교 및 검증
            assertEquals(comments.toString(), expected.toString(), "\"\"의 모든 댓글을 출력!");
        }
    }
}