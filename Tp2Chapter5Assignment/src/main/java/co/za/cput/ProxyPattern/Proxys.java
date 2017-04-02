package co.za.cput.ProxyPattern;

/**
 *
 */
public class Proxys implements ServerInterface{

    private Servers servers = new Servers();

    @Override
    public String message(String words)
    {
        return servers.message(words);
    }
}
