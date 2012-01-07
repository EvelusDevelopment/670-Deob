import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.net.URL;

final class era {

   static int e;
   static Object[] b = sd.a(new Object[1], 66, (byte)127);
   static int a;
   static int c;
   static Object[] d = ed.a(-1, new Object[1], (byte)-108, 126);


   static final void a(Object[] var0, boolean var1, Object[] var2) {
      ++a;
      Object[] var3 = bi.a(31728, ((float[])((float[])var0[1]))[1], 0.0F, ((float[])((float[])var0[1]))[0], ((float[])((float[])var0[1]))[2]);
      Object[] var4 = uja.a(var1, var2);
      Object[] var6 = toa.b(var4, -117);
      ija.a(var6, var3, false);
      ija.a(var6, var2, false);
      Class_cs.a(((float[])((float[])var6[0]))[0], ((float[])((float[])var6[0]))[2], ((float[])((float[])var6[0]))[3], var0, (byte)125);
      mia.a(var3, 1);
      mia.a(var4, 1);
      mia.a(var6, 1);
   }

   static final boolean a(String var0, int var1, String var2, int var3, gi var4) {
      ++e;
      if(var1 != 1416) {
         return false;
      } else if(0 == var3) {
         try {
            if(mna.h.startsWith("win")) {
               if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
                  throw new Exception();
               } else {
                  String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                  for(int var6 = 0; var0.length() > var6; ++var6) {
                     if(0 == ~var13.indexOf(var0.charAt(var6))) {
                        throw new Exception();
                     }
                  }

                  Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
                  return true;
               }
            } else {
               throw new Exception();
            }
         } catch (Throwable var7) {
            return false;
         }
      } else if(1 == var3) {
         try {
            Object var5 = fu.a(var4, new Object[]{(new URL(var4.getCodeBase(), var0)).toString()}, -113, var2);
            return null != var5;
         } catch (Throwable var8) {
            return false;
         }
      } else if(var3 == 2) {
         try {
            var4.getAppletContext().showDocument(new URL(var4.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var9) {
            return false;
         }
      } else if(3 == var3) {
         try {
            fu.a("loggedout", false, var4);
         } catch (Throwable var11) {
            ;
         }

         try {
            var4.getAppletContext().showDocument(new URL(var4.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var10) {
            return false;
         }
      } else if(var3 == 4) {
         try {
            fu.a(var4, new Object[]{(new URL(var4.getCodeBase(), var0)).toString()}, -103, "shim");
            return true;
         } catch (Throwable var12) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void a(Object[] var0, byte var1) {
      ++c;
      if(var1 == -67) {
         Class_ls var2;
         Class_ls var3;
         for(Object[] var4 = null != (var2 = (Class_ls)qt.a(var1 + 67, (Object[])((Object[])var0[4])))?var2.j:null; var4 != null; var4 = (var3 = (Class_ls)nda.a(1, (Object[])((Object[])var0[4]))) == null?null:var3.j) {
            if(var0 != null && (-4 == ~var0.length && var0[0].equals(Integer.valueOf(0)) || var0.length == 29 && var0[2].equals(Integer.valueOf(0)))) {
               return;
            }

            if(var0[3] != var4) {
               while(1 == ((OggStreamState)var4[2]).packetOut()) {
                  qk.a(1, var4, (OggPacket)var0[0]);
               }
            }
         }

         if(var0[3] != null) {
            for(int var6 = 0; 10 > var6 && fka.a(var1 - 19933, var0); ++var6) {
               if(((OggStreamState)((Object[])((Object[])var0[3]))[2]).packetOut() != 1) {
                  kw.a(-5, var0);
                  return;
               }

               qk.a(1, (Object[])((Object[])var0[3]), (OggPacket)var0[0]);
            }

            if(null == var0 || -2 != ~var0.length || !var0[0].equals(Integer.valueOf(0))) {
               ;
            }
         }
      }
   }

}
