package com.ease.archiecture.springannotation;


import org.springframework.stereotype.Component;

@Component
public class Clazz {

    public Person getPerson() {
//        System.out.println(person.stream().forEach(e->e.getName()));
        return person;
    }

//        @Autowired
//    @Qualifier("abc")
//    @Resource(name = "abc")
//    @Inject
    private Person person;


    public void clazzPrint() {
        System.out.println("printClazz");
    }
}
