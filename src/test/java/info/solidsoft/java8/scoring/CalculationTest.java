package info.solidsoft.java8.scoring;

import info.solidsoft.java8.people.Sex;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculationTest {

    @Test
    void shouldCalculateScoring() {

        //given
        Person p1 = Person.builder()
                .age(32)
                .weightKg(250)
                .sex(Sex.MALE)
                .firstName("Pawel")
                .lastName("T")
                .heightMeters(1.96)
                .build();

        LoanApplication loanApplication = new LoanApplication(30, 100_000);

        //when
        Scoring scoring = ScoringCalculator.calculate(p1, loanApplication);

        //then
        assertThat(scoring).isEqualTo(new Scoring(93));
    }
}
