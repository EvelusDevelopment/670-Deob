import java.io.IOException;

final class cja {

   static int[] f = new int[]{0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
   static boolean d = false;
   static int h;
   static int b;
   static int f_l;
   static int k;
   static int f_i;
   static int c;
   static int j;
   static int g;
   static int a;
   static int e;


   static final void a(Object[] var0, int[] var1, byte var2) {
      var1[3] = ((int[])((int[])var0[1]))[18];
      var1[2] = ((int[])((int[])var0[1]))[14];
      var1[0] = ((int[])((int[])var0[1]))[11];
      ++a;
      var1[1] = ((int[])((int[])var0[1]))[13];
      if(var2 != 102) {
         g = 42;
      }

   }

   static final boolean a(Object[] var0, int var1, int var2, byte var3) {
      ++c;
      if(null != var0 && -21 == ~var0.length && var0[14].equals(Integer.valueOf(0))) {
         cq.a(77, (int[])null, true, -111, (Object[])null);
      }

      if(var3 != -52) {
         return ((boolean[])((boolean[])var0[0]))[26];
      } else {
         wr var4;
         wr var5;
         for(Object[] var6 = (var4 = (wr)dda.a((Object[])((Object[])var0[3]), 2)) == null?null:var4.f_l; null != var6; var6 = null != (var5 = (wr)client.a((Object[])((Object[])var0[3]), -28280))?var5.f_l:null) {
            if(jp.a(-30, var2, var6, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   static final int b(int var0, Object[] var1) {
      int var2 = -126 / ((-16 - var0) / 56);
      ++k;
      return 1;
   }

   static final int a(int var0, Object[] var1) {
      if(var0 < 110) {
         a((Object[])null, 28, (Object[])null, ((int[])((int[])var1[0]))[12]);
      }

      ++e;
      byte[] var10000 = (byte[])((byte[])var1[2]);
      int[] var10001 = (int[])((int[])var1[1]);
      int var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      int var2 = var10000[var10004] + -ts.a((Object[])((Object[])var1[3]), 1) & 255;
      if(var2 < 128) {
         return var2;
      } else {
         int var3 = -128 + var2 << 8;
         byte[] var10002 = (byte[])((byte[])var1[2]);
         int[] var10003 = (int[])((int[])var1[1]);
         int var10006 = ((int[])((int[])var1[1]))[0];
         var10003[0] = ((int[])((int[])var1[1]))[0] + 1;
         return var3 + (255 & var10002[var10006] + -ts.a((Object[])((Object[])var1[3]), 1));
      }
   }

   static final int a(byte var0, Object[] var1) {
      ++f_l;
      int var2 = ((int[])((int[])var1[12]))[41];
      Object[] var3 = ro.a((int)3, var1);
      int var5 = -8 / ((var0 - 48) / 51);
      int var4 = lt.a((byte)-128, (Object[])((Object[])var1[30]));
      if(-1 != var4 && !((boolean[])((boolean[])var1[8]))[7]) {
         if(~var4 != ~((int[])((int[])var3[1]))[10] && ((int[])((int[])var3[1]))[25] != var4 && ((int[])((int[])var3[1]))[23] != var4 && var4 != ((int[])((int[])var3[1]))[28]) {
            if(((int[])((int[])var3[1]))[22] == var4 || var4 == ((int[])((int[])var3[1]))[11] || var4 == ((int[])((int[])var3[1]))[9] || var4 == ((int[])((int[])var3[1]))[37]) {
               var2 = ((int[])((int[])var1[12]))[51];
            }
         } else {
            var2 = ((int[])((int[])var1[12]))[50];
         }
      } else {
         var2 = ((int[])((int[])var1[12]))[44];
      }

      return var2;
   }

   static final boolean a(Object[] var0, int var1) {
      if(var1 != -30323) {
         a(((int[])((int[])var0[6]))[10], -63, (Object[])((Object[])var0[13]));
      }

      ++f_i;

      try {
         return fqa.a(var0, 109);
      } catch (IOException var5) {
         if(ipa.d != 15) {
            wv.a((byte)108);
            return true;
         } else {
            var0[8] = null;
            return false;
         }
      } catch (Exception var6) {
         String var3 = (null != var0[0]?((int[])((int[])((Object[])((Object[])var0[0]))[0]))[1]:-1) + wu.o + (var0[9] == null?-1:((int[])((int[])((Object[])((Object[])var0[9]))[0]))[1]) + wu.o + (var0[10] != null?((int[])((int[])((Object[])((Object[])var0[10]))[0]))[1]:-1) + " " + ((int[])((int[])var0[1]))[2] + wu.o + (((int[])((int[])uta.g[33]))[0] + rs.f) + wu.o + (((int[])((int[])uta.g[14]))[0] + qm.d) + " ";

         for(int var4 = 0; ((int[])((int[])var0[1]))[2] > var4 && var4 < 50; ++var4) {
            var3 = var3 + ((byte[])((byte[])((Object[])((Object[])var0[4]))[2]))[var4] + wu.o;
         }

         if(var0 != null && -14 == ~var0.length) {
            eo.b = ((int[])((int[])dca.e[15]))[4];
         }

         taa.a(var6, 32, var3);
         hna.a(-96, false);
         if(var0 != null && -7 == ~var0.length && var0[2].equals(Boolean.valueOf(false)) && var0[2].equals(Integer.valueOf(2))) {
            hf.a(new Object[4][], false, (byte)105);
         }

         return true;
      }
   }

   static final int[] a(int var0, int var1, Object[] var2) {
      if(var1 > -23) {
         a((int)-4, (Object[])null);
      }

      ++h;
      int[] var3 = od.a(-1704, var0, (Object[])((Object[])var2[5]));
      if(((boolean[])((boolean[])((Object[])((Object[])var2[5]))[4]))[0]) {
         int[] var4 = vea.a(var2, 0, !((boolean[])((boolean[])var2[3]))[2]?var0:wq.e - var0, (byte)-8);
         if(!((boolean[])((boolean[])var2[3]))[1]) {
            qo.a(var4, 0, var3, 0, fo.b);
         } else {
            if(var2 != null && (var2.length == 1 || 21 == var2.length || -6 == ~var2.length)) {
               ic.b((Object[])null, 119);
            }

            for(int var5 = 0; fo.b > var5; ++var5) {
               var3[var5] = var4[td.q - var5];
            }
         }
      }

      return var3;
   }

   static final void a(Object[] var0, boolean var1) {
      if(var0[4] == null) {
         var0[4] = new long[1];
      }

      if(!var1) {
         d = false;
      }

      if(null == var0[1]) {
         var0[1] = new int[1];
      }

      ++b;
   }

   static final void a(Object[] var0, int var1, Object[] var2, int var3) {
      ++j;
      if(var1 >= 23) {
         if(var0 != null && var0.length == 2) {
            nua.a(var3, false, var0, var2);
         } else if(null != var0 && var0.length == 10) {
            moa.a((byte)126, var2, (Object[])((Object[])var0[0]));
            za.a(var3, -20929, (Object[])((Object[])var0[0]));
         } else if(null != var0 && var0.length == 8) {
            moa.a((byte)106, var2, (Object[])((Object[])var0[0]));
            za.a(var3, -20929, (Object[])((Object[])var0[0]));
         } else if(null != var0 && var0.length == 3) {
            spa.a(var0, var3, var2, (byte)-78);
         } else if(null == var2 || 16 != var2.length) {
            if(var0 != null && -8 == ~var0.length) {
               if(!((boolean[])((boolean[])var0[6]))[0]) {
                  moa.a((byte)125, var2, (Object[])((Object[])var0[0]));
                  za.a(var3, -20929, (Object[])((Object[])var0[0]));
               }

            } else if(null != var0 && var0.length == 6) {
               gla.a(var2, (byte)114, var0, var3);
            } else if(var0 != null && var0.length == 9) {
               if(var2 != null) {
                  if(((boolean[])((boolean[])var0[8]))[0]) {
                     af.a(768, (Object[])((Object[])var0[0]), 30579, 5890, 0);
                     db.a(770, (Object[])((Object[])var0[0]), (byte)-68, 0, 5890);
                     ((boolean[])((boolean[])var0[8]))[0] = false;
                  }

                  moa.a((byte)110, var2, (Object[])((Object[])var0[0]));
                  za.a(var3, -20929, (Object[])((Object[])var0[0]));
               } else if(!((boolean[])((boolean[])var0[8]))[0]) {
                  moa.a((byte)107, (Object[])((Object[])((Object[])((Object[])var0[0]))[7]), (Object[])((Object[])var0[0]));
                  za.a(1, -20929, (Object[])((Object[])var0[0]));
                  af.a(768, (Object[])((Object[])var0[0]), 30579, '\u8578', 0);
                  db.a(770, (Object[])((Object[])var0[0]), (byte)-68, 0, '\u8578');
                  ((boolean[])((boolean[])var0[8]))[0] = true;
               }

            } else if(var0 != null && 5 == var0.length) {
               oka.a(true, var0, var2, var3);
            } else if(null == var0 || 4 != var0.length) {
               throw new IllegalStateException();
            }
         }
      }
   }

}
