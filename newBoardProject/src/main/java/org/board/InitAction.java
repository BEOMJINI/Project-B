package org.board;

import lombok.RequiredArgsConstructor;
import org.board.domain.IntegrationBoard;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Component //자동으로 객체를 생성해줌
@RequiredArgsConstructor //final 붙은 값을 넣어줌
public class InitAction {
    private final InitService initService;
    @PostConstruct // 생성자가 만들어지면 바로 호출되는 메서드.
    public void init(){
        initService.EarlySettingBoard();
    }
}

@Component
@Transactional
@RequiredArgsConstructor
class InitService{

    private final EntityManager em;
    
    public void EarlySettingBoard(){
        System.out.println("초기 작업 실행");
        String[] BoardCategory = {"자유게시판" , "park게시판" , "kim게시판"};
        for (String s : BoardCategory) {
            IntegrationBoard integrationBoard = new IntegrationBoard(
                    s);
            em.persist(integrationBoard);
        }

    }
}


