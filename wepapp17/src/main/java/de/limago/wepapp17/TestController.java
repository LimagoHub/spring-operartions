package de.limago.wepapp17;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
@AllArgsConstructor
public class TestController {

    private final PersonDtoMapper mapper;
    @GetMapping(path="/test", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hallo() {
        return "Hallo Welt";

    }

    @PostMapping(path="/insert", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insert(@RequestBody PersonDTO dto) {
        var p = mapper.convert(dto);
        System.out.println(p);

    }
}
