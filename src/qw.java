import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class qw {

   static boolean d = false;
   private static int e;
   private static String b;
   private static String c;
   private static Hashtable a = new Hashtable(16);


   public static void a(String var0, byte var1, int var2) {
      c = var0;
      if(var1 != 107) {
         a((String)null, (byte)-63, -89);
      }

      e = var2;

      try {
         b = System.getProperty("user.home");
         if(b != null) {
            b = b + "/";
         }
      } catch (Exception var4) {
         ;
      }

      if(null == b) {
         b = "~/";
      }

      d = true;
   }

   public static File a(int var0, String var1) {
      if(var0 != -2) {
         e = 79;
      }

      return a(var1, c, var0 + 2, e);
   }

   private qw() throws Throwable {
      throw new Error();
   }

   public static File a(String var0, String var1, int var2, int var3) {
      try {
         if(!d) {
            throw new RuntimeException("");
         } else {
            File var4 = (File)a.get(var0);
            if(null != var4) {
               return var4;
            } else {
               String[] var5 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", b, "/tmp/", ""};
               String[] var6 = new String[]{".jagex_cache_" + var3, ".file_store_" + var3};

               for(int var7 = var2; var7 < 2; ++var7) {
                  for(int var8 = 0; ~var8 > ~var6.length; ++var8) {
                     for(int var9 = 0; ~var9 > ~var5.length; ++var9) {
                        String var10 = var5[var9] + var6[var8] + "/" + (var1 == null?"":var1 + "/") + var0;
                        RandomAccessFile var11 = null;

                        try {
                           File var12 = new File(var10);
                           if(var7 != 0 || var12.exists()) {
                              String var13 = var5[var9];
                              if(1 != var7 || -1 <= ~var13.length() || (new File(var13)).exists()) {
                                 (new File(var5[var9] + var6[var8])).mkdir();
                                 if(var1 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + var1)).mkdir();
                                 }

                                 var11 = new RandomAccessFile(var12, "rw");
                                 int var14 = var11.read();
                                 var11.seek(0L);
                                 var11.write(var14);
                                 var11.seek(0L);
                                 var11.close();
                                 a.put(var0, var12);
                                 return var12;
                              }
                           }
                        } catch (Exception var16) {
                           try {
                              if(var11 != null) {
                                 var11.close();
                                 var11 = null;
                              }
                           } catch (Exception var15) {
                              ;
                           }
                        }
                     }
                  }
               }

               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var17) {
         throw var17;
      }
   }

}
