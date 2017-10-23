package com.telefonica.bigdata.convert;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.z.ZCompressorInputStream;
import org.apache.log4j.Logger;


public class ZDecoder {
	
	final static Logger logger = Logger.getLogger(ZDecoder.class);
	
	public void decodeZ(String inputFilePath,String outputFilePath)
	{
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : ");
		}

		if(logger.isInfoEnabled()){
			logger.info("This is info : ");
		}

		    FileInputStream fin;
	        FileOutputStream fout;
	        BufferedInputStream in;
	        ZCompressorInputStream zIn;
	      
			try {
				fin = new FileInputStream(inputFilePath);
				in = new BufferedInputStream(fin);
				fout = new FileOutputStream(outputFilePath);
				
				  try {
					  
					   zIn = new ZCompressorInputStream(in);
					  
					   int buffersize = 1024;

				        try {
				        	
				        	final byte[] buffer = new byte[buffersize];
				        	int n = 0;
				        	
				        	while (-1 != (n = zIn.read(buffer))) {
				        			if(n < 1024)
				        			{
				        				fout.write(buffer, 0, n-1);
				        			}else
				        			{
				        				fout.write(buffer, 0, n);
				        			}	
				        	}
				        
				        

				        	zIn.close();
				        	fout.close();

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					   
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	

	public void decodeGz(String inputFilePath, String outputFilePath)
	{
		 FileInputStream fin;
	        FileOutputStream fout;
	        BufferedInputStream in;
	        GzipCompressorInputStream zIn;
	        BufferedReader br;
			try {
				fin = new FileInputStream(inputFilePath);
				in = new BufferedInputStream(fin);
				fout = new FileOutputStream(outputFilePath);
				
				  try {
					  
					   zIn = new GzipCompressorInputStream(in);
					   br = new BufferedReader(new InputStreamReader(zIn));
					   
					   BufferedOutputStream out = new BufferedOutputStream(fout);
					   @SuppressWarnings("resource")
				
					   int buffersize = 1024;

				        try {
				        	
				        	final byte[] buffer = new byte[buffersize];
				        	int n = 0;
				        	
				        	while (-1 != (n = zIn.read(buffer))) {
				        		if(n > 0)
				        			fout.write(buffer, 0, n);
				        	}
				        	zIn.close();
				        	fout.close();
				        	
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				        try {
							br.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					   
					   
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	
	public void encodeGz(String outputFilePath)
	{
		
	}

	public void recode(String inputFilePath, String outputFilePath) {
		 System.out.println( "Convierte de Z a gz" );
		 	        
	        FileInputStream fin;
	        FileOutputStream fout;
	        BufferedInputStream in;
	        ZCompressorInputStream zIn;
	        BufferedReader br;
			try {
				fin = new FileInputStream(inputFilePath);
				in = new BufferedInputStream(fin);
				fout = new FileOutputStream(outputFilePath);
				
				  try {
					  
					   zIn = new ZCompressorInputStream(in);
					   br = new BufferedReader(new InputStreamReader(zIn));
					   
					   BufferedOutputStream out = new BufferedOutputStream(fout);
					   @SuppressWarnings("resource")
					GzipCompressorOutputStream gzOut = new GzipCompressorOutputStream(out);

					   int buffersize = 1024;

				        try {
				        	
				        	final byte[] buffer = new byte[buffersize];
				        	int n = 0;
				        	
				        	while (-1 != (n = zIn.read(buffer))) {
				        		if(n > 0)
				        			gzOut.write(buffer, 0, n);
				        	}
				        	zIn.close();
				        	gzOut.close();
				        	
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				        try {
							br.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					   
					   
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        

	}

}
