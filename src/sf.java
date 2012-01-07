import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;

final class sf {

   static int f;
   static int e;
   static int f_i;
   static int h;
   static cga[] g;
   static int c;
   static int[] d = new int[13];
   static int b = 0;
   static int[] a = new int[]{22, 23};


   static final void b(int var0) {
      vk.c = var0;
      ++f;
      mfa.g = null;
      waa.c = 0;
      tr.e = null;
      Class_b.f_i = null;
      pq.a((byte)-97, vqa.n);
   }

   static final boolean a(int var0) {
      if(var0 > -16) {
         g = (cga[])null;
      }

      ++f_i;
      boolean var1 = true;
      if(qt.b == null) {
         if(!hp.a(-126, lta.h, ib.b)) {
            var1 = false;
         } else {
            qt.b = aea.b(lta.h, ib.b);
         }
      }

      if(wka.c == null) {
         if(!hp.a(-125, lta.h, vta.B)) {
            var1 = false;
         } else {
            wka.c = aea.b(lta.h, vta.B);
         }
      }

      if(null == jn.e) {
         if(hp.a(-127, lta.h, uoa.b)) {
            jn.e = aea.b(lta.h, uoa.b);
         } else {
            var1 = false;
         }
      }

      if(null == gua.f) {
         if(hp.a(-127, nf.c, ck.b)) {
            gua.f = jh.a(ck.b, false, nf.c);
         } else {
            var1 = false;
         }
      }

      if(una.d == null) {
         if(hp.a(-127, lta.h, ck.b)) {
            una.d = aea.a(lta.h, ck.b);
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   static final Socket createSocket(Object[] wrapper) throws IOException {
      ++c;
      if(((boolean[])((boolean[])wrapper[2]))[1]) {
         Object[] var3 = mla.a(!((boolean[])((boolean[])wrapper[2]))[0]?((int[])((int[])wrapper[1]))[2]:((int[])((int[])wrapper[1]))[1], (String)wrapper[0], -13566);
         if(null != var3) {
            boolean var5 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
            if(!var5) {
               System.setProperty("java.net.useSystemProxies", "true");
            }

            if(null != var3 && 1 == var3.length && var3[0].equals(Integer.valueOf(1))) {
               return null;
            } else {
               boolean var8 = ((int[])((int[])var3[1]))[0] == 443;

               Socket var4;
               List var6;
               List var7;
               try {
                  var6 = ((ProxySelector)var3[2]).select(new URI((var8?"https":"http") + "://" + (String)var3[0]));
                  var7 = ((ProxySelector)var3[2]).select(new URI((!var8?"https":"http") + "://" + (String)var3[0]));
               } catch (URISyntaxException var33) {
                  var4 = fea.b(var3, 112);
                  return var4;
               }

               var6.addAll(var7);
               Object[] var9 = var6.toArray();
               spa var10 = null;
               Object[] var11 = var9;
               int var12 = 0;

               while(true) {
                  if(var11.length <= var12) {
                     if(null != var10) {
                        throw var10;
                     }

                     var4 = fea.b(var3, 112);
                     break;
                  }

                  Object var13 = var11[var12];
                  Proxy var14 = (Proxy)var13;

                  try {
                     Socket var15;
                     if(var14.type() == Type.DIRECT) {
                        var15 = fea.b(var3, 112);
                     } else {
                        SocketAddress var16 = var14.address();
                        if(!(var16 instanceof InetSocketAddress)) {
                           var15 = null;
                        } else {
                           InetSocketAddress var17 = (InetSocketAddress)var16;
                           if(var14.type() == Type.HTTP) {
                              String var35 = null;

                              String var25;
                              try {
                                 Class var19 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                                 Method var20 = var19.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                                 var20.setAccessible(true);
                                 Object var21 = var20.invoke((Object)null, new Object[]{var17.getHostName(), new Integer(var17.getPort())});
                                 if(var21 != null) {
                                    Method var22 = var19.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                                    var22.setAccessible(true);
                                    if(((Boolean)var22.invoke(var21, new Object[0])).booleanValue()) {
                                       Method var23 = var19.getDeclaredMethod("getHeaderName", new Class[0]);
                                       var23.setAccessible(true);
                                       Method var24 = var19.getDeclaredMethod("getHeaderValue", new Class[]{URL.class, String.class});
                                       var24.setAccessible(true);
                                       var25 = (String)var23.invoke(var21, new Object[0]);
                                       String var26 = (String)var24.invoke(var21, new Object[]{new URL("https://" + (String)var3[0] + "/"), "https"});
                                       var35 = var25 + ": " + var26;
                                    }
                                 }
                              } catch (Exception var30) {
                                 ;
                              }

                              String var36 = var17.getHostName();
                              int var39 = var17.getPort();
                              Socket var37 = new Socket(var36, var39);
                              var37.setSoTimeout(10000);
                              if(var3 != null && var3.length == 1) {
                                 oe.a((Object[])null);
                              }

                              OutputStream var38 = var37.getOutputStream();
                              if(var35 != null) {
                                 var38.write(("CONNECT " + (String)var3[0] + ":" + ((int[])((int[])var3[1]))[0] + " HTTP/1.0\n" + var35 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
                              } else {
                                 var38.write(("CONNECT " + (String)var3[0] + ":" + ((int[])((int[])var3[1]))[0] + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
                              }

                              Socket var34;
                              label149: {
                                 var38.flush();
                                 BufferedReader var40 = new BufferedReader(new InputStreamReader(var37.getInputStream()));
                                 var25 = var40.readLine();
                                 if(null != var25) {
                                    if(var25.startsWith("HTTP/1.0 200") || var25.startsWith("HTTP/1.1 200")) {
                                       var34 = var37;
                                       break label149;
                                    }

                                    if(var25.startsWith("HTTP/1.0 407") || var25.startsWith("HTTP/1.1 407")) {
                                       int var41 = 0;
                                       String var27 = "proxy-authenticate: ";

                                       for(var25 = var40.readLine(); null != var25 && var41 < 50; var25 = var40.readLine()) {
                                          if(var25.toLowerCase().startsWith(var27)) {
                                             var25 = var25.substring(var27.length()).trim();
                                             int var28 = var25.indexOf(32);
                                             if(~var28 != 0) {
                                                var25 = var25.substring(0, var28);
                                             }

                                             throw new spa(var25);
                                          }

                                          ++var41;
                                       }

                                       throw new spa("");
                                    }
                                 }

                                 var38.close();
                                 var40.close();
                                 var34 = null;
                                 var37.close();
                              }

                              var15 = var34;
                           } else if(var14.type() == Type.SOCKS) {
                              Socket var18 = new Socket(var14);
                              var15 = var18;
                              var18.connect(new InetSocketAddress((String)var3[0], ((int[])((int[])var3[1]))[0]));
                           } else {
                              var15 = null;
                           }
                        }
                     }

                     if(var15 != null) {
                        var4 = var15;
                        break;
                     }
                  } catch (spa var31) {
                     var10 = var31;
                  } catch (IOException var32) {
                     ;
                  }

                  ++var12;
               }

               return var4;
            }
         } else {
            throw new IllegalStateException();
         }
      } else {
         return new Socket(InetAddress.getByName((String)wrapper[0]), !((boolean[])((boolean[])wrapper[2]))[0]?((int[])((int[])wrapper[1]))[2]:((int[])((int[])wrapper[1]))[1]);
      }
   }

   static final Object[] a(Object[] var0, int var1) {
      if(var1 != 13) {
         return (Object[])null;
      } else {
         if(var0[13] == null) {
            var0[13] = new byte[1];
         }

         if(var0[1] == null) {
            var0[1] = new int[15];
         }

         ++h;
         jma.b((byte)-2, var0);
         return var0;
      }
   }

}
