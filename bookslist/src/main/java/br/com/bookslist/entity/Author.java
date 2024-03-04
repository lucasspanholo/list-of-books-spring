package br.com.bookslist.entity;
import jakarta.persistence.*;

@Table(name = "author") //nome da tabela no banco de dados
@Entity(name = "author") //nome usado para referenciar dentro do spring
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "name")
    private String name;

    public Author(String name){
        this.name = name;
    }
}
