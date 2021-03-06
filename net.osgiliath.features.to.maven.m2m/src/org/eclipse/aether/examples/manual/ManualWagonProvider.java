package org.eclipse.aether.examples.manual;

import org.apache.maven.wagon.Wagon;
import org.sonatype.aether.connector.wagon.WagonProvider;
import org.sonatype.maven.wagon.AhcWagon;
public class ManualWagonProvider implements WagonProvider
{

    public Wagon lookup( String roleHint )
        throws Exception
    {
        if ( "http".equals( roleHint ) )
        {
            return new AhcWagon();
        }
        return null;
    }

    public void release( Wagon wagon )
    {

    }
}
