package com.afs.tdd;

import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;
class DemoTest {
    //north
    @Test
    void  should_return_LocationX_0_LocationY_1_Direction_N_when_execute_command_given_LocationX_0_LocationY_0_Direction_N_Command_M() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,1,"N");

        //when
        Marsrover.executeCommand("M");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_E_when_execute_command_given_LocationX_0_LocationY_0_Direction_N_Command_R() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"E");

        //when
        Marsrover.executeCommand("R");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }
    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_W_when_execute_command_given_LocationX_0_LocationY_0_Direction_N_Command_L() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"W");

        //when
        Marsrover.executeCommand("L");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }
//south
    @Test
    void  should_return_LocationX_0_LocationY_minus1_Direction_S_when_execute_command_given_LocationX_0_LocationY_0_Direction_S_Command_M() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,-1,"S");

        //when
        Marsrover.executeCommand("M");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_W_when_execute_command_given_LocationX_0_LocationY_0_Direction_S_Command_R() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"W");

        //when
        Marsrover.executeCommand("R");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_E_when_execute_command_given_LocationX_0_LocationY_0_Direction_S_Command_L() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"E");

        //when
        Marsrover.executeCommand("L");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    //west
    @Test
    void  should_return_LocationX_minus1_LocationY_0_Direction_W_when_execute_command_given_LocationX_0_LocationY_0_Direction_W_Command_M() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"W"));
        RoverStatus expectedRoverStatus = new RoverStatus(-1,0,"W");

        //when
        Marsrover.executeCommand("M");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_N_when_execute_command_given_LocationX_0_LocationY_0_Direction_W_Command_R() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"W"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"N");

        //when
        Marsrover.executeCommand("R");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_S_when_execute_command_given_LocationX_0_LocationY_0_Direction_W_Command_L() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"W"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"S");

        //when
        Marsrover.executeCommand("L");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }
    //east
    @Test
    void  should_return_LocationX_1_LocationY_0_Direction_W_when_execute_command_given_LocationX_0_LocationY_0_Direction_E_Command_M() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"E"));
        RoverStatus expectedRoverStatus = new RoverStatus(1,0,"E");

        //when
        Marsrover.executeCommand("M");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }


    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_S_when_execute_command_given_LocationX_0_LocationY_0_Direction_E_Command_R() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"S");

        //when
        Marsrover.executeCommand("R");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

    @Test
    void  should_return_LocationX_0_LocationY_0_Direction_N_when_execute_command_given_LocationX_0_LocationY_0_Direction_E_Command_L() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"N");

        //when
        Marsrover.executeCommand("L");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }
    //complex
    @Test
    void  should_return_LocationX_0_LocationY_2_Direction_W_when_execute_command_given_LocationX_0_LocationY_0_Direction_N_Command_MML() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(-1,-1,"W");

        //when
        Marsrover.executeCommand("LLMRM");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationX(), marsRover.getRoverStatus().getLocationX());
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
        Assertions.assertEquals(expectedRoverStatus.getDirection(), marsRover.getRoverStatus().getDirection());
    }

}
