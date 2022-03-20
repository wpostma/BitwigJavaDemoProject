
package com.warrenpostma.util;

//import de.mossgrabers.framework.daw.IHost;
import com.bitwig.extension.controller.api.ControllerHost;


/**
 * Similar global logger to DBM. 
 */
public class ConsoleLogger
{
    private static ControllerHost globalHost;


    /**
     * Constructor.
     */
    private ConsoleLogger ()
    {
        // Intentionally empty
    }


    /**
     * Initialize the host for logging.
     *
     * @param host The host
     */
    public static void init (final ControllerHost host)
    {
        globalHost = host;
    }


    /**
     * Log a message.
     *
     * @param message The message
     */
    public static void log (final String message)
    {
        if (globalHost != null)
            globalHost.println (message);
    }
}
