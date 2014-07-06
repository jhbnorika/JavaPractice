package com.norika.java.feature.j7;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderTest {

	public static void main(String[] args) {
		new Thread("urlclassloader") {

			@Override
			public void run() {
				URL url = null;
				URLClassLoader urlClassLoader = null;
				try {
					try {
						url = new URL(
								"http://img1.moko.cc/users/0/37/11146/face/img1_src_5501580.jpg");
						Object obj = url.getContent();
						System.out.println(obj.getClass().getName());
						urlClassLoader = new URLClassLoader(new URL[] { url });
						String name = urlClassLoader.getClass().getName();
						System.out.println(name);
					} finally {
						if (urlClassLoader != null)
							urlClassLoader.close();
					}
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				super.run();
			}

		}.start();

	}

}
