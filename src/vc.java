import java.awt.Component;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
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

final class vc implements Runnable {

   private static String f_l;
   boolean k;
   private static volatile long h = 0L;
   private vba d;
   private Class_l f_i;
   private Object b;
   private doa m;
   private static String e;
   private static int n;
   private static String g;
   static Method c;
   boolean f;
   private vba a;
   private Object o;
   private boolean j;


   private final vba a(Object var1, int var2, int var3, int var4, int var5) {
      vba var6 = new vba();
      var6.e = var1;
      var6.a = var4;
      if(var2 > -44) {
         return (vba)null;
      } else {
         var6.g = var3;
         var6.f = var5;
         synchronized(this) {
            if(null != this.d) {
               this.d.d = var6;
               this.d = var6;
            } else {
               this.d = this.a = var6;
            }

            this.notify();
            return var6;
         }
      }
   }

   final vba a(URL var1, int var2) {
      if(var2 != 4) {
         this.a((URL)null, -15);
      }

      return this.a(var1, -68, 0, 4, 0);
   }

   public final void run() {
      while(true) {
         vba var3;
         synchronized(this) {
            while(true) {
               if(this.j) {
                  return;
               }

               if(this.a != null) {
                  var3 = this.a;
                  this.a = this.a.d;
                  if(null == this.a) {
                     this.d = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var36) {
                  ;
               }
            }
         }

         try {
            int var4 = var3.a;
            if(var4 == 1) {
               if(he.a(105) < h) {
                  throw new IOException();
               }

               var3.c = new Socket(InetAddress.getByName((String)var3.e), var3.g);
            } else if(var4 != 22) {
               if(2 != var4) {
                  if(4 == var4) {
                     if(he.a(-61) < h) {
                        throw new IOException();
                     }

                     var3.c = new DataInputStream(((URL)var3.e).openStream());
                  } else {
                     Object[] var5;
                     if(8 != var4) {
                        if(9 == var4) {
                           var5 = (Object[])((Object[])var3.e);
                           if(this.f && null == ((Class)var5[0]).getClassLoader()) {
                              throw new SecurityException();
                           }

                           var3.c = ((Class)var5[0]).getDeclaredField((String)var5[1]);
                        } else if(18 != var4) {
                           if(var4 != 19) {
                              if(!this.f) {
                                 throw new Exception("");
                              }

                              String var45;
                              if(3 == var4) {
                                 if(he.a(61) < h) {
                                    throw new IOException();
                                 }

                                 var45 = (255 & var3.g >> 24) + "." + (255 & var3.g >> 16) + "." + ((var3.g & '\uff73') >> 8) + "." + (var3.g & 255);
                                 var3.c = InetAddress.getByName(var45).getHostName();
                              } else if(21 == var4) {
                                 if(h > he.a(72)) {
                                    throw new IOException();
                                 }

                                 var3.c = InetAddress.getByName((String)var3.e).getAddress();
                              } else if(var4 != 5) {
                                 if(var4 == 6) {
                                    Frame var46 = new Frame("Jagex Full Screen");
                                    var3.c = var46;
                                    var46.setResizable(false);
                                    if(this.k) {
                                       this.f_i.a(-62, var3.f >> 16, var46, var3.g >>> 16, var3.g & '\uffff', var3.f & '\uffff');
                                    } else {
                                       Class.forName("kra").getMethod("enter", new Class[]{Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}).invoke(this.o, new Object[]{var46, new Integer(var3.g >>> 16), new Integer('\uffff' & var3.g), new Integer(var3.f >> 16), new Integer(var3.f & '\uffff')});
                                    }
                                 } else if(7 == var4) {
                                    if(!this.k) {
                                       Class.forName("kra").getMethod("exit", new Class[0]).invoke(this.o, new Object[0]);
                                    } else {
                                       this.f_i.a((Frame)var3.e, -31839);
                                    }
                                 } else if(12 != var4) {
                                    if(13 == var4) {
                                       var5 = a(n, -3990, "", (String)var3.e);
                                       var3.c = null != var5?var5[0]:null;
                                    } else if(this.f && var4 == 14) {
                                       int var49 = var3.g;
                                       int var47 = var3.f;
                                       if(!this.k) {
                                          Class.forName("asa").getDeclaredMethod("movemouse", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.b, new Object[]{new Integer(var49), new Integer(var47)});
                                       } else {
                                          this.m.a(false, var49, var47);
                                       }
                                    } else if(this.f && var4 == 15) {
                                       boolean var50 = var3.g != 0;
                                       Component var48 = (Component)var3.e;
                                       if(!this.k) {
                                          Class.forName("asa").getDeclaredMethod("showcursor", new Class[]{Component.class, Boolean.TYPE}).invoke(this.b, new Object[]{var48, new Boolean(var50)});
                                       } else {
                                          this.m.a(var48, (byte)-17, var50);
                                       }
                                    } else if(!this.k && var4 == 17) {
                                       var5 = (Object[])((Object[])var3.e);
                                       Class.forName("asa").getDeclaredMethod("setcustomcursor", new Class[]{Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class}).invoke(this.b, new Object[]{var5[0], var5[1], new Integer(var3.g), new Integer(var3.f), var5[2]});
                                    } else {
                                       if(16 != var4) {
                                          throw new Exception("");
                                       }

                                       try {
                                          if(!g.startsWith("win")) {
                                             throw new Exception();
                                          }

                                          var45 = (String)var3.e;
                                          if(!var45.startsWith("http://") && !var45.startsWith("https://")) {
                                             throw new Exception();
                                          }

                                          String var6 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                                          for(int var7 = 0; var45.length() > var7; ++var7) {
                                             if(-1 == var6.indexOf(var45.charAt(var7))) {
                                                throw new Exception();
                                             }
                                          }

                                          Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var45 + "\"");
                                          var3.c = null;
                                       } catch (Exception var37) {
                                          var3.c = var37;
                                          throw var37;
                                       }
                                    }
                                 } else {
                                    var5 = a(n, -3990, e, (String)var3.e);
                                    var3.c = var5 == null?null:var5[0];
                                 }
                              } else if(!this.k) {
                                 var3.c = Class.forName("kra").getMethod("listmodes", new Class[0]).invoke(this.o, new Object[0]);
                              } else {
                                 var3.c = this.f_i.a(-21223);
                              }
                           } else {
                              Transferable var52 = (Transferable)var3.e;
                              Clipboard var51 = Toolkit.getDefaultToolkit().getSystemClipboard();
                              var51.setContents(var52, (ClipboardOwner)null);
                           }
                        } else {
                           Clipboard var54 = Toolkit.getDefaultToolkit().getSystemClipboard();
                           var3.c = var54.getContents((Object)null);
                        }
                     } else {
                        var5 = (Object[])((Object[])var3.e);
                        if(this.f && null == ((Class)var5[0]).getClassLoader()) {
                           throw new SecurityException();
                        }

                        var3.c = ((Class)var5[0]).getDeclaredMethod((String)var5[1], (Class[])((Class[])var5[2]));
                     }
                  }
               } else {
                  Thread var55 = new Thread((Runnable)var3.e);
                  var55.setDaemon(true);
                  var55.start();
                  var55.setPriority(var3.g);
                  var3.c = var55;
               }
            } else {
               if(he.a(-110) < h) {
                  throw new IOException();
               }

               try {
                  Object[] var53 = mla.a(var3.g, (String)var3.e, -13566);
                  if(var53 == null) {
                     throw new IllegalStateException();
                  }

                  if(null != var53 && var53.length == 23) {
                     e = null;
                  }

                  boolean var9 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
                  if(!var9) {
                     System.setProperty("java.net.useSystemProxies", "true");
                  }

                  boolean var12 = ((int[])((int[])var53[1]))[0] == 443;

                  Socket var8;
                  label406: {
                     List var10;
                     List var11;
                     try {
                        var10 = ((ProxySelector)var53[2]).select(new URI((var12?"https":"http") + "://" + (String)var53[0]));
                        var11 = ((ProxySelector)var53[2]).select(new URI((!var12?"https":"http") + "://" + (String)var53[0]));
                     } catch (URISyntaxException var40) {
                        var8 = fea.b(var53, 112);
                        break label406;
                     }

                     var10.addAll(var11);
                     Object[] var13 = var10.toArray();
                     spa var14 = null;
                     Object[] var15 = var13;
                     int var16 = 0;

                     while(true) {
                        if(var15.length <= var16) {
                           if(var14 != null) {
                              throw var14;
                           }

                           var8 = fea.b(var53, 112);
                           break;
                        }

                        Object var17 = var15[var16];
                        Proxy var18 = (Proxy)var17;

                        try {
                           Socket var19;
                           if(var18.type() != Type.DIRECT) {
                              SocketAddress var20 = var18.address();
                              if(!(var20 instanceof InetSocketAddress)) {
                                 var19 = null;
                              } else {
                                 InetSocketAddress var21 = (InetSocketAddress)var20;
                                 if(var18.type() != Type.HTTP) {
                                    if(var18.type() == Type.SOCKS) {
                                       Socket var56 = new Socket(var18);
                                       var56.connect(new InetSocketAddress((String)var53[0], ((int[])((int[])var53[1]))[0]));
                                       var19 = var56;
                                    } else {
                                       var19 = null;
                                    }
                                 } else {
                                    String var22 = null;

                                    String var29;
                                    try {
                                       Class var23 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                                       Method var24 = var23.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                                       var24.setAccessible(true);
                                       Object var25 = var24.invoke((Object)null, new Object[]{var21.getHostName(), new Integer(var21.getPort())});
                                       if(null != var25) {
                                          Method var26 = var23.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                                          var26.setAccessible(true);
                                          if(((Boolean)var26.invoke(var25, new Object[0])).booleanValue()) {
                                             Method var27 = var23.getDeclaredMethod("getHeaderName", new Class[0]);
                                             var27.setAccessible(true);
                                             Method var28 = var23.getDeclaredMethod("getHeaderValue", new Class[]{URL.class, String.class});
                                             var28.setAccessible(true);
                                             var29 = (String)var27.invoke(var25, new Object[0]);
                                             String var30 = (String)var28.invoke(var25, new Object[]{new URL("https://" + (String)var53[0] + "/"), "https"});
                                             var22 = var29 + ": " + var30;
                                          }
                                       }
                                    } catch (Exception var35) {
                                       ;
                                    }

                                    String var59 = var21.getHostName();
                                    int var58 = var21.getPort();
                                    Socket var61 = new Socket(var59, var58);
                                    var61.setSoTimeout(10000);
                                    OutputStream var62 = var61.getOutputStream();
                                    if(var22 == null) {
                                       var62.write(("CONNECT " + (String)var53[0] + ":" + ((int[])((int[])var53[1]))[0] + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
                                    } else {
                                       var62.write(("CONNECT " + (String)var53[0] + ":" + ((int[])((int[])var53[1]))[0] + " HTTP/1.0\n" + var22 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
                                    }

                                    if(var53 != null && -7 == ~var53.length && var53[1].equals(Integer.valueOf(2))) {
                                       this.b = null;
                                    }

                                    Socket var57;
                                    label353: {
                                       var62.flush();
                                       BufferedReader var60 = new BufferedReader(new InputStreamReader(var61.getInputStream()));
                                       var29 = var60.readLine();
                                       if(var29 != null) {
                                          if(var29.startsWith("HTTP/1.0 200") || var29.startsWith("HTTP/1.1 200")) {
                                             var57 = var61;
                                             break label353;
                                          }

                                          if(var29.startsWith("HTTP/1.0 407") || var29.startsWith("HTTP/1.1 407")) {
                                             int var63 = 0;
                                             if(var53 != null && -5 == ~var53.length) {
                                                c = null;
                                             }

                                             String var31 = "proxy-authenticate: ";

                                             for(var29 = var60.readLine(); null != var29 && var63 < 50; ++var63) {
                                                if(var29.toLowerCase().startsWith(var31)) {
                                                   var29 = var29.substring(var31.length()).trim();
                                                   int var32 = var29.indexOf(32);
                                                   if(-1 != var32) {
                                                      var29 = var29.substring(0, var32);
                                                   }

                                                   throw new spa(var29);
                                                }

                                                var29 = var60.readLine();
                                             }

                                             throw new spa("");
                                          }
                                       }

                                       var62.close();
                                       var60.close();
                                       var61.close();
                                       var57 = null;
                                    }

                                    var19 = var57;
                                 }
                              }
                           } else {
                              var19 = fea.b(var53, 112);
                           }

                           if(var19 != null) {
                              var8 = var19;
                              break;
                           }
                        } catch (spa var38) {
                           var14 = var38;
                        } catch (IOException var39) {
                           ;
                        }

                        ++var16;
                     }
                  }

                  var3.c = var8;
               } catch (spa var41) {
                  var3.c = var41.getMessage();
                  throw var41;
               }
            }

            var3.b = 1;
         } catch (ThreadDeath var42) {
            throw var42;
         } catch (Throwable var43) {
            var3.b = 2;
         }

         synchronized(var3) {
            var3.notify();
         }
      }
   }

   final boolean a(File var1, byte[] var2, int var3) {
      try {
         try {
            FileOutputStream var4 = new FileOutputStream(var1);
            var4.write(var2, 0, var2.length);
            var4.close();
            int var5 = -82 / ((var3 + 58) / 47);
            return true;
         } catch (IOException var6) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var7) {
         throw var7;
      }
   }

   private static final Object[] a(int var0, int var1, String var2, String var3) {
      String var4;
      if(var0 == 33) {
         var4 = "jagex_" + var2 + "_preferences" + var3 + "_rc.dat";
      } else if(34 != var0) {
         var4 = "jagex_" + var2 + "_preferences" + var3 + ".dat";
      } else {
         var4 = "jagex_" + var2 + "_preferences" + var3 + "_wip.dat";
      }

      String[] var5 = new String[]{"c:/rscache/", "/rscache/", f_l, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
      if(var1 != -3990) {
         a(101, 28, (String)null, (String)null);
      }

      for(int var6 = 0; var5.length > var6; ++var6) {
         String var7 = var5[var6];
         if(var7.length() <= 0 || (new File(var7)).exists()) {
            try {
               Object[] var8 = es.a(new Object[3], 10000L, "rw", (byte)-36, new File(var7, var4));
               return var8;
            } catch (Exception var9) {
               ;
            }
         }
      }

      return null;
   }

   private vc() throws Throwable {
      throw new Error();
   }

}
