package it.epicode.Spring_JUnit.print;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrintService {

    public void print(Printable printable) {
        log.info(printable.print());
    }
}
