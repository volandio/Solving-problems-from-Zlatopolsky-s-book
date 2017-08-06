package com.A.training.B.C.sinitsynv;

import static com.A.training.B.util.Assert.assertEquals;

public class TaskCh06N087Test {
    public static void main(String[] args) {
        testResult();
    }

    public static void testResult() {
        Game game = new Game();
        game.setTeamFirst("A");
        game.setTeamSecond("B");
        game.setScoreFirst(16);
        game.setScoreSecond(12);
        assertEquals("TaskCh06N087Test.testResult", "Winner A=16 : Looser B=12", game.result());
    }

}
