package hiber.model;

import javax.persistence.*;

//@Component
@Entity
@Table(name = "cars")
public class Car {

    @Id//аннотация указывает идентификатор объекта.
    // Объект должен всегда иметь атрибут идентификатора, который используется при загрузке объекта в данном контексте сохранения.
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//проверить что должно быть или поставиь AUTO, IDENTITY, SEQUENCE, TABLE.
    //Аннотация @GeneratedValue используется для указания способа создания первичного ключа.
    @Column (name = "series")
    private int series;
//    @Column(name = "id", nullable = false)
//    private Long id;

    @Column (name = "model")//аннотирование используется для указания соответствия между атрибутом базовой сущности
    private String model;



    //@OneToOne(mappedBy = "car")
    //private User user;

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +  ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }



}
