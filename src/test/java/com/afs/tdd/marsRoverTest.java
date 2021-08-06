package com.afs.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
class marsRoverTest {

    @Test
    void  should_return_LocationX_0_LocationY_1_Direction_N_when_execute_command_given_LocationX_0_LocationY_0_Direction_N_Command_M() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"N"));
        roverStatus expectedRoverStatus = new roverStatus(0,1,"N");

        //when
        com.afs.tdd.marsRover.executeCommand("M");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_E_when_execute_command_given_LocationX_0_LocationY_0_Direction_N_Command_R() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"N"));
        roverStatus expectedRoverStatus = new roverStatus(0,0,"E");

        //when
        com.afs.tdd.marsRover.executeCommand("R");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }
    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_W_when_execute_command_given_LocationX_0_LocationY_0_Direction_N_Command_L() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"N"));
        roverStatus expectedRoverStatus = new roverStatus(0,0,"W");

        //when
        com.afs.tdd.marsRover.executeCommand("L");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_minus1_Direction_S_when_execute_command_given_LocationX_0_LocationY_0_Direction_S_Command_M() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"S"));
        roverStatus expectedRoverStatus = new roverStatus(0,-1,"S");

        //when
        com.afs.tdd.marsRover.executeCommand("M");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_W_when_execute_command_given_LocationX_0_LocationY_0_Direction_S_Command_R() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"S"));
        roverStatus expectedRoverStatus = new roverStatus(0,0,"W");

        //when
        com.afs.tdd.marsRover.executeCommand("R");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_E_when_execute_command_given_LocationX_0_LocationY_0_Direction_S_Command_L() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"S"));
        roverStatus expectedRoverStatus = new roverStatus(0,0,"E");

        //when
        com.afs.tdd.marsRover.executeCommand("L");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_minus1_LocationY_0_Direction_W_when_execute_command_given_LocationX_0_LocationY_0_Direction_W_Command_M() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"W"));
        roverStatus expectedRoverStatus = new roverStatus(-1,0,"W");

        //when
        com.afs.tdd.marsRover.executeCommand("M");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_N_when_execute_command_given_LocationX_0_LocationY_0_Direction_W_Command_R() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"W"));
        roverStatus expectedRoverStatus = new roverStatus(0,0,"N");

        //when
        com.afs.tdd.marsRover.executeCommand("R");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_S_when_execute_command_given_LocationX_0_LocationY_0_Direction_W_Command_L() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"W"));
        roverStatus expectedRoverStatus = new roverStatus(0,0,"S");

        //when
        com.afs.tdd.marsRover.executeCommand("L");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_1_LocationY_0_Direction_W_when_execute_command_given_LocationX_0_LocationY_0_Direction_E_Command_M() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"E"));
        roverStatus expectedRoverStatus = new roverStatus(1,0,"E");

        //when
        com.afs.tdd.marsRover.executeCommand("M");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }


    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_S_when_execute_command_given_LocationX_0_LocationY_0_Direction_E_Command_R() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"E"));
        roverStatus expectedRoverStatus = new roverStatus(0,0,"S");

        //when
        com.afs.tdd.marsRover.executeCommand("R");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_N_when_execute_command_given_LocationX_0_LocationY_0_Direction_E_Command_L() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"E"));
        roverStatus expectedRoverStatus = new roverStatus(0,0,"N");

        //when
        com.afs.tdd.marsRover.executeCommand("L");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }
    //complex
    @Test
    void  should_return_LocationX_minus1_LocationY_minus1_Direction_W_when_execute_command_given_LocationX_0_LocationY_0_Direction_N_Command_LLMRM() {
        //given
        marsRover marsRover = new marsRover(new roverStatus(0,0,"N"));
        roverStatus expectedRoverStatus = new roverStatus(-1,-1,"W");

        //when
        com.afs.tdd.marsRover.executeCommand("LLMRM");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

}
