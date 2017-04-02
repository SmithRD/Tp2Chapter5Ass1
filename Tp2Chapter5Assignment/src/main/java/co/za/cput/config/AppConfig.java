package co.za.cput.config;

import co.za.cput.AbstractFactory.Car;
import co.za.cput.AbstractFactory.Motorcycle;
import co.za.cput.AbstractFactory.TransportFactory2;
import co.za.cput.Adapter.FloatAdapter;
import co.za.cput.Adapter.FloatClass;
import co.za.cput.Bridge.Abstraction;
import co.za.cput.Prototype.Clone;
import co.za.cput.Prototype.Sheep;
import co.za.cput.ProxyPattern.Proxys;
import co.za.cput.ProxyPattern.ServerInterface;
import co.za.cput.Singleton.Dog;
import co.za.cput.Strategy.Fish;
import co.za.cput.Strategy.Move;
import co.za.cput.Visitor.BlondeGirlfriend;
import co.za.cput.Visitor.Girlfriend;
import co.za.cput.Visitor.GirlfriendVisitor;
import co.za.cput.Visitor.GirlfriendVisitorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import co.za.cput.AbstractFactory.TransportFactory;

/**
 *
 */
@Configuration
public class AppConfig {

    @Bean(name = "dog")
    public Dog getDog(){return Dog.getInstance();}

    @Bean(name = "transportCar")
    public Car getTransportCar() {return TransportFactory.getInstance().getModel();}

    @Bean(name = "transport2Car")
    public Car getTransport2Car() {return TransportFactory2.getInstance().getModel();}

    @Bean(name = "transportMotorcycle")
    public Motorcycle getTransportMotorcycle() {return TransportFactory.getInstance().getType();}

    @Bean(name = "dolly")
    public Clone getClone() {return new Sheep("Dolly", "Scottland");}

    @Bean(name ="adapt")
    public FloatAdapter getValue() {return new FloatClass();}

    @Bean(name ="bridge")
    public Abstraction getAbstraction() {return new Abstraction();}

    @Bean(name ="proxy")
    public ServerInterface getProxy() {return new Proxys();}

    @Bean(name ="girlfriend")
    public GirlfriendVisitor getVisitor() {return new GirlfriendVisitorImpl();}

    @Bean(name ="blondie")
    public Girlfriend getGirlfriend() {return new BlondeGirlfriend("Jennifer");}

    @Bean(name ="nemo")
    public Move getMovement() {return new Fish();}



}
