package com.afs.tdd;

import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Assertions;
class DemoTest {
    @Test
    void  should_return_LocationX_0_LocationY_1_Direction_N_when_execute_command_given_LocationX_0_LocationY_0_Direction_N_Command_M() {
        //given
        Marsrover marsRover = new Marsrover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,1,"N");

        //when
        Marsrover.executeCommand("M");

        //then
        Assertions.assertEquals(expectedRoverStatus.getLocationY(), marsRover.getRoverStatus().getLocationY());
    }
}
