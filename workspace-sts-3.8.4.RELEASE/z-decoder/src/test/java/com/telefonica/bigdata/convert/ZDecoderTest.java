package com.telefonica.bigdata.convert;

import junit.framework.TestCase;

public class ZDecoderTest extends TestCase {


	public void testZtoGz() {

			System.out.println("Corriendo Caso de prueba");
			String input = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000004.iq.Z";
			String output = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000004.iq.gz";	
			ZDecoder decoder = new ZDecoder();
			decoder.recode(input, output);
	
		}
	//
	//
	//
	//17100419.ind.20171005000004.iq.Z
	public void testZtoTxt1() {

		System.out.println("Corriendo Caso de prueba");
		String input = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000004.iq.Z";
		String output = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000004.iq.txt";	
		ZDecoder decoder = new ZDecoder();
		decoder.decodeZ(input, output);

	}
	
	public void testZtoTxt2() {

		System.out.println("Corriendo Caso de prueba");
		String input = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000033.iq.Z";
		String output = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000033.iq.txt";	
		ZDecoder decoder = new ZDecoder();
		decoder.decodeZ(input, output);

	}
	
	public void testZtoTxt3() {

		System.out.println("Corriendo Caso de prueba");
		String input = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000036.iq.Z";
		String output = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000036.iq.txt";	
		ZDecoder decoder = new ZDecoder();
		decoder.decodeZ(input, output);

	}
	
	public void testZtoTxt4() {

		System.out.println("Corriendo Caso de prueba");
		String input = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000045.iq.Z";
		String output = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000045.iq.txt";	
		ZDecoder decoder = new ZDecoder();
		decoder.decodeZ(input, output);

	}
	
	public void testGztoTxt() {

		System.out.println("Corriendo Caso de prueba");
		String input = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000004.iq.gz";
		String output = "/Users/rhmaripa/Documents/workspace-sts-3.8.4.RELEASE/mediacion-decoder/src/test/resources/17100419.ind.20171005000004.iq.fromgz.txt";	
		ZDecoder decoder = new ZDecoder();
		decoder.decodeGz(input, output);

	}
}
