import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;

final class it {

   static int f;
   static int g;
   static int h;
   static int a;
   static int j;
   static int f_i;
   static int d;
   static Object[] b = ura.a(-46, new Object[2]);
   static int e;
   static Hashtable c = new Hashtable();


   static final void a(Object[] var0, Object[] var1, boolean var2) {
      ++f;
      if(var1 != null && 1 == var1.length && var1[0].equals(Boolean.valueOf(false))) {
         ac.a(11937, (Object[])null, '\uffff');
      }

      while(true) {
         int var3 = fh.a(var1, false);
         if(var3 == 0) {
            if(!var2) {
               a((Object[])null, (Object[])null, true);
            }

            return;
         }

         if(var3 != 1) {
            int var4;
            int var5;
            byte var6;
            if(var3 != 2) {
               if(var3 == 3) {
                  var4 = fh.a(var1, false);
                  var0[0] = new char[var4];
                  var0[5] = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     ((int[])((int[])var0[5]))[var5] = de.a((int)0, var1);
                     var6 = ipa.a(var1, (int)-104);
                     ((char[])((char[])var0[0]))[var5] = 0 == var6?0:kf.a(var2, var6);
                  }
               } else if(var3 != 4) {
                  ;
               }
            } else {
               var4 = fh.a(var1, false);
               var0[4] = new int[var4];
               if(var1 != null && 8 == var1.length && var1[4].equals(Integer.valueOf(1)) && var1[4].equals(Integer.valueOf(2))) {
                  return;
               }

               var0[3] = new char[var4];

               for(var5 = 0; var4 > var5; ++var5) {
                  ((int[])((int[])var0[4]))[var5] = de.a((int)0, var1);
                  var6 = ipa.a(var1, (int)-128);
                  ((char[])((char[])var0[3]))[var5] = 0 != var6?kf.a(true, var6):0;
               }
            }
         } else {
            var0[2] = ara.b((byte)61, var1);
         }
      }
   }

   static final boolean a(int var0, Object[] var1) {
      if(var0 != -2) {
         return true;
      } else {
         ++d;
         return true;
      }
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      ++e;
      if(var0 != -6130) {
         b = (Object[])null;
      }

      kaa.a(var1, (byte)122);
      aa.a(15022, var2, var1);
      return var1;
   }

   static final void a(Object[] var0, byte var1) {
      ++a;
      if(var1 <= 6) {
         b = (Object[])null;
      }

   }

   static final void a(boolean var0, byte var1, boolean var2, String var3) {
      ++j;

      Object[] var4;
      try {
         label301: {
            if(!var3.equalsIgnoreCase("commands") && !var3.equalsIgnoreCase("help")) {
               if(!var3.equalsIgnoreCase("cls")) {
                  if(var3.equalsIgnoreCase("displayfps")) {
                     su.d = !su.d;
                     if(!su.d) {
                        qs.a((byte)125, "FPS off");
                     } else {
                        qs.a((byte)-118, "FPS on");
                     }

                     return;
                  }

                  if(!var3.equals("renderer")) {
                     if(var1 < 124) {
                        b = (Object[])null;
                     }

                     if(var3.equals("heap")) {
                        qs.a((byte)-13, "Heap: " + Class_e.f + "MB");
                        return;
                     }

                     if(var3.equalsIgnoreCase("getcamerapos")) {
                        qs.a((byte)-123, "Pos: " + ((byte[])((byte[])uta.g[10]))[0] + "," + ((woa.M >> 9) + rs.f >> 6) + "," + ((pta.f >> 9) + qm.d >> 6) + "," + (63 & (woa.M >> 9) + rs.f) + "," + (63 & (pta.f >> 9) + qm.d) + " Height: " + (Class_ds.a(((byte[])((byte[])uta.g[10]))[0], woa.M, pta.f, (byte)122) - qt.e));
                        qs.a((byte)12, "Look: " + ((byte[])((byte[])uta.g[10]))[0] + "," + (rs.f + pia.b >> 6) + "," + (mka.b + qm.d >> 6) + "," + (63 & pia.b + rs.f) + "," + (63 & mka.b + qm.d) + " Height: " + (Class_ds.a(((byte[])((byte[])uta.g[10]))[0], pia.b, mka.b, (byte)122) + -of.b));
                        return;
                     }
                     break label301;
                  }

                  var4 = lna.g.E();
                  qs.a((byte)120, "Toolkit ID: " + bg.a(true, (Object[])((Object[])tu.d[5])));
                  qs.a((byte)-47, "Vendor: " + ((int[])((int[])var4[1]))[1]);
                  qs.a((byte)-8, "Name: " + (String)var4[3]);
                  qs.a((byte)-63, "Version: " + ((int[])((int[])var4[1]))[0]);
                  qs.a((byte)118, "Device: " + (String)var4[0]);
                  qs.a((byte)-17, "Driver Version: " + ((long[])((long[])var4[2]))[0]);
                  return;
               }

               jr.b = 0;
               gka.d = 0;
               return;
            }

            qs.a((byte)-98, "commands - This command");
            qs.a((byte)115, "cls - Clear console");
            qs.a((byte)114, "displayfps - Toggle FPS and other information");
            qs.a((byte)26, "renderer - Print graphics renderer information");
            qs.a((byte)-107, "heap - Print java memory information");
            qs.a((byte)114, "getcamerapos - Print location and direction of camera for use in bug reports");
            return;
         }
      } catch (Exception var21) {
         qs.a((byte)119, gj.a(dp.y, -44, gj.f_rb));
         return;
      }

      if(po.f_i != mka.g || 2 <= oda.h) {
         try {
            if(var3.equalsIgnoreCase("wm1")) {
               bsa.a((byte)-122, false, -1, -1, 1);
               if(-2 == ~afa.b((byte)-85)) {
                  qs.a((byte)113, "Success");
               } else {
                  qs.a((byte)-57, "Failure");
               }

               return;
            }

            if(var3.equalsIgnoreCase("wm2")) {
               bsa.a((byte)-122, false, -1, -1, 2);
               if(afa.b((byte)-85) != 2) {
                  qs.a((byte)7, "Failure");
               } else {
                  qs.a((byte)-60, "Success");
               }

               return;
            }

            if(eb.f && var3.equalsIgnoreCase("wm3")) {
               bsa.a((byte)-122, false, 1024, 768, 3);
               if(-4 == ~afa.b((byte)-85)) {
                  qs.a((byte)-20, "Success");
               } else {
                  qs.a((byte)126, "Failure");
               }

               return;
            }

            if(var3.equalsIgnoreCase("tk0")) {
               lg.a(false, 0, (byte)-95);
               if(bg.a(true, (Object[])((Object[])tu.d[5])) != 0) {
                  qs.a((byte)-128, "Failure");
               } else {
                  qs.a((byte)125, "Success");
                  ih.a(tu.d, (Object[])((Object[])tu.d[21]), 0, -34);
                  uk.a((byte)104);
                  mr.f = false;
               }

               return;
            }

            if(var3.equalsIgnoreCase("tk1")) {
               lg.a(false, 1, (byte)-84);
               if(bg.a(true, (Object[])((Object[])tu.d[5])) != 1) {
                  qs.a((byte)119, "Failure");
               } else {
                  qs.a((byte)114, "Success");
                  ih.a(tu.d, (Object[])((Object[])tu.d[21]), 1, -101);
                  uk.a((byte)94);
                  mr.f = false;
               }

               return;
            }

            if(var3.equalsIgnoreCase("tk2")) {
               lg.a(false, 2, (byte)-104);
               if(2 == bg.a(true, (Object[])((Object[])tu.d[5]))) {
                  qs.a((byte)125, "Success");
                  ih.a(tu.d, (Object[])((Object[])tu.d[21]), 2, -79);
                  uk.a((byte)65);
                  mr.f = false;
               } else {
                  qs.a((byte)127, "Failure");
               }

               return;
            }

            if(var3.equalsIgnoreCase("tk3")) {
               lg.a(false, 3, (byte)-112);
               if(3 == bg.a(true, (Object[])((Object[])tu.d[5]))) {
                  qs.a((byte)122, "Success");
                  ih.a(tu.d, (Object[])((Object[])tu.d[21]), 3, -123);
                  uk.a((byte)116);
                  mr.f = false;
               } else {
                  qs.a((byte)-95, "Failure");
               }

               return;
            }

            if(var3.equalsIgnoreCase("tk5")) {
               lg.a(false, 5, (byte)-108);
               if(-6 == ~bg.a(true, (Object[])((Object[])tu.d[5]))) {
                  qs.a((byte)-111, "Success");
                  ih.a(tu.d, (Object[])((Object[])tu.d[21]), 5, -94);
                  uk.a((byte)100);
                  mr.f = false;
               } else {
                  qs.a((byte)117, "Failure");
               }

               return;
            }

            if(var3.equalsIgnoreCase("clientdrop")) {
               if(10 == ipa.d) {
                  wv.a((byte)125);
               } else if(13 == ipa.d) {
                  ((boolean[])((boolean[])lba.f[11]))[0] = true;
               }

               return;
            }

            int var5;
            if(var3.equalsIgnoreCase("breakcon")) {
               Object[][] var27 = lba.d;

               for(var5 = 0; var27.length > var5; ++var5) {
                  Object[] var26 = var27[var5];
                  if(var26[8] != null) {
                     ara.a((byte)99, (Object[])((Object[])var26[8]));
                  }
               }

               var4 = dka.g;
               if(var4 != null) {
                  raa.b(true, var4);
                  return;
               }

               throw new IllegalStateException();
            }

            int var24;
            if(var3.startsWith("getclientvarpbit")) {
               var24 = Integer.parseInt(var3.substring(17));
               qs.a((byte)-42, "varpbit=" + ok.a(false, eo.g, var24));
               return;
            }

            if(var3.startsWith("getclientvarp")) {
               var24 = Integer.parseInt(var3.substring(14));
               qs.a((byte)-26, "varp=" + mja.a((byte)-128, eo.g, var24));
               return;
            }

            String[] var23;
            if(var3.startsWith("directlogin")) {
               var23 = ul.a(0, var3.substring(12), ' ');
               if(-3 == ~var23.length) {
                  dfa.a(var23[0], var23[1], (int)4);
               }

               return;
            }

            if(var3.startsWith("snlogin ")) {
               var23 = ul.a(0, var3.substring(8), ' ');
               var5 = Integer.parseInt(var23[0]);
               if(od.a(1)) {
                  if(ce.a != var5) {
                     qca.f = "";
                  }

                  ce.a = var5;
                  iea.a(12, (byte)-126);
               }

               return;
            }

            File var22;
            if(var3.startsWith("setoutput ")) {
               var22 = new File(var3.substring(10));
               if(var22.exists()) {
                  var22 = new File(var3.substring(10) + "." + he.a(48) + ".log");
                  if(var22.exists()) {
                     qs.a((byte)21, "file already exists!");
                     return;
                  }
               }

               if(tl.f != null) {
                  tl.f.close();
                  tl.f = null;
               }

               try {
                  tl.f = new FileOutputStream(var22);
                  return;
               } catch (FileNotFoundException var17) {
                  qs.a((byte)125, "Could not create " + var22.getName());
                  return;
               } catch (SecurityException var18) {
                  qs.a((byte)116, "Cannot write to " + var22.getName());
                  return;
               }
            }

            if(var3.equals("closeoutput")) {
               if(tl.f != null) {
                  tl.f.close();
               }

               tl.f = null;
               return;
            }

            if(var3.startsWith("runscript ")) {
               var22 = new File(var3.substring(10));
               if(!var22.exists()) {
                  qs.a((byte)122, "No such file");
                  return;
               }

               int var7 = (int)var22.length();

               byte[] var6;
               try {
                  byte[] var8 = new byte[var7];
                  var6 = var8;
                  kc.a(var22, var8, -125, var7);
               } catch (IOException var19) {
                  var6 = null;
               }

               if(var6 == null) {
                  qs.a((byte)118, "Failed to read file");
                  return;
               }

               String var28 = bta.a(0, (byte)-112, var6, var6.length);
               String var9 = var28;
               int var10 = var28.length();
               int var11 = "".length();
               int var12 = var10;
               int var13 = var11 - 1;
               if(0 != var13) {
                  int var14 = 0;

                  while(true) {
                     var14 = var9.indexOf(13, var14);
                     if(0 > var14) {
                        break;
                     }

                     ++var14;
                     var12 += var13;
                  }
               }

               StringBuffer var30 = new StringBuffer(var12);
               int var15 = 0;

               while(true) {
                  int var16 = var9.indexOf(13, var15);
                  if(var16 < 0) {
                     var30.append(var9.substring(var15));
                     String var25 = var30.toString();
                     String[] var29 = ul.a(0, var25, '\n');
                     nk.a(var29, 6);
                     break;
                  }

                  var30.append(var9.substring(var15, var16));
                  var15 = 1 + var16;
                  var30.append("");
               }
            }

            if(10 == ipa.d) {
               ++gsa.b;
               var4 = ona.a((byte)126, (Object[])((Object[])lba.f[7]), wda.d);
               ek.putByte((Object[])((Object[])var4[0]), var3.length() + 3);
               ek.putByte((Object[])((Object[])var4[0]), !var2?0:1);
               ek.putByte((Object[])((Object[])var4[0]), !var0?0:1);
               bw.a(var3, (byte)0, (Object[])((Object[])var4[0]));
               lj.a(var4, 6, lba.f);
            }
         } catch (Exception var20) {
            qs.a((byte)120, gj.a(dp.y, -35, gj.f_rb));
            return;
         }
      }

      if(10 != ipa.d) {
         qs.a((byte)-32, gj.a(dp.y, 60, gj.x) + var3);
      }

   }

   static final void a(Object[] var0, boolean var1) throws IOException {
      ++h;
      if(null != var0[2]) {
         ((RandomAccessFile)var0[2]).close();
         var0[2] = null;
      }

      if(var1) {
         a(((boolean[])((boolean[])var0[18]))[7], ((byte[])((byte[])((Object[])((Object[])b[7]))[1]))[0], false, (String)null);
      }

   }

   static final void a(Object[] var0, int var1, int var2) {
      if(((boolean[])((boolean[])var0[8]))[0]) {
         if(var0[12] == null) {
            var0[12] = new long[var2];
         } else {
            qo.a((long[])((long[])var0[12]), 0, (long[])(var0[12] = new long[var2]), 0, ((int[])((int[])var0[1]))[2]);
         }
      }

      ++f_i;
      if(((boolean[])((boolean[])var0[8]))[1]) {
         if(null != var0[3]) {
            qo.a((Object[])((Object[])var0[3]), 0, (Object[])(var0[3] = new String[var2]), 0, ((int[])((int[])var0[1]))[2]);
         } else {
            var0[3] = new String[var2];
         }
      }

      if(var1 != 17577) {
         c = (Hashtable)null;
      }

   }

   static final void a(int var0, boolean var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ++g;
      int var12 = eua.a(sda.c, (byte)-53, var6, sea.k);
      int var13 = eua.a(sda.c, (byte)-53, var2, sea.k);
      int var14 = eua.a(td.r, (byte)-53, var5, hla.g);
      int var15 = eua.a(td.r, (byte)-53, var0, hla.g);
      int var8 = eua.a(sda.c, (byte)-53, var6 + var3, sea.k);
      int var9 = eua.a(sda.c, (byte)-53, var2 - var3, sea.k);

      int var16;
      for(var16 = var12; var16 < var8; ++var16) {
         fka.a(var4, fda.c[var16], var15, var14, (byte)-101);
      }

      for(var16 = var13; var9 < var16; --var16) {
         fka.a(var4, fda.c[var16], var15, var14, (byte)52);
      }

      int var10 = eua.a(td.r, (byte)-53, var5 + var3, hla.g);
      int var11 = eua.a(td.r, (byte)-53, -var3 + var0, hla.g);

      for(var16 = var8; var16 <= var9; ++var16) {
         int[] var17 = fda.c[var16];
         fka.a(var4, var17, var10, var14, (byte)106);
         fka.a(var7, var17, var11, var10, (byte)99);
         fka.a(var4, var17, var15, var11, (byte)-51);
      }

      if(!var1) {
         a(101, false, 53, -95, -82, 67, ((int[])((int[])b[11]))[0], ((int[])((int[])b[1]))[4]);
      }

   }

}
