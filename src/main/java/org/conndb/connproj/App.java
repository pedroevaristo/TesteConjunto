package org.conndb.connproj;

import configDB.InitializerDB;

public class App
{
    public static void main( String[] args )
    {
       configDB.InitializerDB init = new InitializerDB();
       init.initialize();
    }
}
