import java.awt.Canvas;

final class vr {

   static int e;
   static int c;
   static int h;
   static int b;
   static int g;
   static int d;
   static int f;
   static int f_i;
   static int a;


   static final void a(Object[] var0, byte var1, Object[] var2) {
      ++e;
      int var5 = fh.a(var2, false);
      if(var5 == 255) {
         var5 = -1;
      }

      ((int[])((int[])var0[1]))[18] = fh.a(var2, false);
      if((((int[])((int[])var0[1]))[18] & 128) != 0) {
         ((int[])((int[])var0[1]))[18] &= 127;
         var0[53] = ara.b((byte)61, var2);
      }

      ((int[])((int[])var0[1]))[30] = de.a(var1 ^ -122, var2);
      ((int[])((int[])var0[1]))[15] = jia.c(var1 ^ 8092, var2);
      ((int[])((int[])var0[1]))[53] = jia.c(var1 ^ 8092, var2);
      ((int[])((int[])var0[1]))[43] = de.a((int)0, var2);
      ((int[])((int[])var0[1]))[41] = de.a((int)0, var2);
      ((byte[])((byte[])var0[45]))[2] = ipa.a(var2, (int)-128);
      ((byte[])((byte[])var0[45]))[3] = ipa.a(var2, (int)-124);
      ((byte[])((byte[])var0[45]))[1] = ipa.a(var2, (int)-109);
      ((byte[])((byte[])var0[45]))[0] = ipa.a(var2, (int)-111);
      ((int[])((int[])var0[1]))[39] = de.a((int)0, var2);
      if(((int[])((int[])var0[1]))[39] != '\uffff') {
         ((int[])((int[])var0[1]))[39] += -65536 & ((int[])((int[])var0[1]))[3];
      } else {
         ((int[])((int[])var0[1]))[39] = -1;
      }

      int var6 = fh.a(var2, false);
      ((boolean[])((boolean[])var0[5]))[18] = (1 & var6) != 0;
      if(0 <= var5) {
         ((boolean[])((boolean[])var0[5]))[9] = (var6 & 2) != 0;
      }

      if(((int[])((int[])var0[1]))[18] == 0) {
         ((int[])((int[])var0[1]))[56] = de.a((int)0, var2);
         ((int[])((int[])var0[1]))[55] = de.a((int)0, var2);
         if(var5 < 0) {
            ((boolean[])((boolean[])var0[5]))[9] = -2 == ~fh.a(var2, false);
         }
      }

      int var7;
      if(((int[])((int[])var0[1]))[18] == 5) {
         ((int[])((int[])var0[1]))[57] = lr.a(var1 + 123, var2);
         ((int[])((int[])var0[1]))[31] = de.a((int)0, var2);
         var7 = fh.a(var2, false);
         ((boolean[])((boolean[])var0[5]))[15] = (var7 & 1) != 0;
         ((boolean[])((boolean[])var0[5]))[2] = (var7 & 2) != 0;
         ((int[])((int[])var0[1]))[1] = fh.a(var2, false);
         ((int[])((int[])var0[1]))[19] = fh.a(var2, false);
         if(null != var2 && (6 == var2.length || var2.length == 1 && var2[0].equals(Integer.valueOf(2)) && var2[0].equals(Integer.valueOf(1)))) {
            bda.d = null;
         }

         ((int[])((int[])var0[1]))[54] = lr.a(1, var2);
         ((boolean[])((boolean[])var0[5]))[14] = fh.a(var2, false) == 1;
         ((boolean[])((boolean[])var0[5]))[1] = fh.a(var2, false) == 1;
         ((int[])((int[])var0[1]))[11] = lr.a(1, var2);
         if(var5 >= 3) {
            ((boolean[])((boolean[])var0[5]))[3] = fh.a(var2, false) == 1;
         }
      }

      if(((int[])((int[])var0[1]))[18] == 6) {
         ((int[])((int[])var0[1]))[44] = 1;
         ((int[])((int[])var0[1]))[61] = fma.c(var1 - 17004, var2);
         var7 = fh.a(var2, false);
         ((boolean[])((boolean[])var0[5]))[12] = (var7 & 2) == 2;
         boolean var8 = -2 == ~(var7 & 1);
         ((boolean[])((boolean[])var0[5]))[5] = -5 == ~(var7 & 4);
         if(null != var2 && -3 == ~var2.length) {
            fr.g = new Object[4][];
         }

         ((boolean[])((boolean[])var0[5]))[11] = 8 == (var7 & 8);
         if(var8) {
            ((int[])((int[])var0[1]))[52] = jia.c(-8166, var2);
            ((int[])((int[])var0[1]))[45] = jia.c(-8166, var2);
            ((int[])((int[])var0[1]))[37] = de.a((int)0, var2);
            ((int[])((int[])var0[1]))[62] = de.a(var1 ^ -122, var2);
            ((int[])((int[])var0[1]))[66] = de.a((int)0, var2);
            ((int[])((int[])var0[1]))[10] = de.a(var1 ^ -122, var2);
         } else if(((boolean[])((boolean[])var0[5]))[12]) {
            ((int[])((int[])var0[1]))[52] = jia.c(var1 - 8044, var2);
            ((int[])((int[])var0[1]))[45] = jia.c(-8166, var2);
            ((int[])((int[])var0[1]))[64] = jia.c(-8166, var2);
            ((int[])((int[])var0[1]))[37] = de.a((int)0, var2);
            ((int[])((int[])var0[1]))[62] = de.a((int)0, var2);
            ((int[])((int[])var0[1]))[66] = de.a((int)0, var2);
            ((int[])((int[])var0[1]))[10] = jia.c(-8166, var2);
         }

         ((int[])((int[])var0[1]))[51] = fma.c(-17126, var2);
         if(((byte[])((byte[])var0[45]))[2] != 0) {
            ((int[])((int[])var0[1]))[68] = de.a((int)0, var2);
         }

         if(-1 != ~((byte[])((byte[])var0[45]))[3]) {
            ((int[])((int[])var0[1]))[35] = de.a((int)0, var2);
         }
      }

      if(-5 == ~((int[])((int[])var0[1]))[18]) {
         ((int[])((int[])var0[1]))[16] = fma.c(-17126, var2);
         if(var5 >= 2) {
            ((boolean[])((boolean[])var0[5]))[16] = -2 == ~fh.a(var2, false);
         }

         var0[58] = ara.b((byte)61, var2);
         ((int[])((int[])var0[1]))[8] = fh.a(var2, false);
         ((int[])((int[])var0[1]))[14] = fh.a(var2, false);
         ((int[])((int[])var0[1]))[72] = fh.a(var2, false);
         ((boolean[])((boolean[])var0[5]))[8] = fh.a(var2, false) == 1;
         ((int[])((int[])var0[1]))[11] = lr.a(1, var2);
         ((int[])((int[])var0[1]))[1] = fh.a(var2, false);
         if(0 <= var5) {
            ((int[])((int[])var0[1]))[65] = fh.a(var2, false);
         }
      }

      if(((int[])((int[])var0[1]))[18] == 3) {
         ((int[])((int[])var0[1]))[11] = lr.a(var1 + 123, var2);
         ((boolean[])((boolean[])var0[5]))[13] = -2 == ~fh.a(var2, false);
         ((int[])((int[])var0[1]))[1] = fh.a(var2, false);
      }

      if(9 == ((int[])((int[])var0[1]))[18]) {
         ((int[])((int[])var0[1]))[38] = fh.a(var2, false);
         ((int[])((int[])var0[1]))[11] = lr.a(1, var2);
         ((boolean[])((boolean[])var0[5]))[7] = fh.a(var2, false) == 1;
      }

      var7 = td.a(var2, 102);
      int var19 = fh.a(var2, false);
      int var9;
      if(var19 != 0) {
         if(var0 != null && -11 == ~var0.length) {
            oqa.e = ((int[])((int[])jl.b[6]))[8];
         }

         var0[34] = new byte[11];
         var0[25] = new byte[11];

         for(var0[0] = new int[11]; 0 != var19; var19 = fh.a(var2, false)) {
            var9 = -1 + (var19 >> 4);
            var19 = fh.a(var2, false) | var19 << 8;
            if(var2 != null && var2.length == 2) {
               va.a((Object[])((Object[])Class_ls.m[32]), var1 ^ -18, (Object[])null, (Object[])null);
            }

            var19 &= 4095;
            if(4095 == var19) {
               var19 = -1;
            }

            byte var10 = ipa.a(var2, (int)-105);
            if(var10 != 0) {
               ((boolean[])((boolean[])var0[5]))[4] = true;
            }

            byte var11 = ipa.a(var2, (int)-123);
            ((int[])((int[])var0[0]))[var9] = var19;
            ((byte[])((byte[])var0[25]))[var9] = var10;
            ((byte[])((byte[])var0[34]))[var9] = var11;
         }
      }

      var0[15] = ara.b((byte)61, var2);
      var9 = fh.a(var2, false);
      int var21 = 15 & var9;
      int var12;
      if(0 < var21) {
         var0[16] = new String[var21];

         for(var12 = 0; var12 < var21; ++var12) {
            ((String[])((String[])var0[16]))[var12] = ara.b((byte)61, var2);
         }

         if(null != var2 && 16 == var2.length) {
            ((byte[])((byte[])bda.d[0]))[2] = ((byte[])((byte[])jl.b[3]))[8];
         }
      }

      int var20 = var9 >> 4;
      int var13;
      if(0 < var20) {
         var12 = fh.a(var2, false);
         var0[2] = new int[1 + var12];
         if(var0 != null && var0.length == 1 && var0[0].equals(Integer.valueOf(0)) && var0[0].equals(Integer.valueOf(1))) {
            pt.c = (Object[])((Object[])Class_ls.m[3]);
         }

         for(var13 = 0; ((int[])((int[])var0[2])).length > var13; ++var13) {
            ((int[])((int[])var0[2]))[var13] = -1;
         }

         ((int[])((int[])var0[2]))[var12] = de.a((int)0, var2);
      }

      if(1 < var20) {
         var12 = fh.a(var2, false);
         ((int[])((int[])var0[2]))[var12] = de.a((int)0, var2);
      }

      var0[57] = ara.b((byte)61, var2);
      if(((String)var0[57]).equals("")) {
         var0[57] = null;
      }

      ((int[])((int[])var0[1]))[32] = fh.a(var2, false);
      if(var1 != -122) {
         a(-116, (Object[])null);
      }

      ((int[])((int[])var0[1]))[5] = fh.a(var2, false);
      ((int[])((int[])var0[1]))[40] = fh.a(var2, false);
      var0[60] = ara.b((byte)61, var2);
      var12 = -1;
      var13 = (var7 & 261626) >> 11;
      if(var13 != 0) {
         var12 = de.a((int)0, var2);
         if('\uffff' == var12) {
            var12 = -1;
         }

         ((int[])((int[])var0[1]))[34] = de.a((int)0, var2);
         if(-65536 == ~((int[])((int[])var0[1]))[34]) {
            ((int[])((int[])var0[1]))[34] = -1;
         }

         ((int[])((int[])var0[1]))[48] = de.a((int)0, var2);
         if(((int[])((int[])var0[1]))[48] == '\uffff') {
            ((int[])((int[])var0[1]))[48] = -1;
         }
      }

      if(var5 >= 0) {
         ((int[])((int[])var0[1]))[63] = de.a(var1 ^ -122, var2);
         if(-65536 == ~((int[])((int[])var0[1]))[63]) {
            ((int[])((int[])var0[1]))[63] = -1;
         }
      }

      var0[9] = kna.a(new Object[2], var1 ^ -64, var7, var12);
      if(var5 >= 0) {
         int var14 = fh.a(var2, false);

         int var15;
         int var17;
         int var16;
         for(var15 = 0; var14 > var15; ++var15) {
            var16 = td.a(var2, 98);
            var17 = lr.a(var1 + 123, var2);
            Object[] var3;
            di.a((Object[])((Object[])var0[63]), true, (lm)(null != (var3 = ps.a((byte)-102, var17, new Object[2]))?var3[0]:null), (long)var16);
         }

         var15 = fh.a(var2, false);

         for(var16 = 0; var15 > var16; ++var16) {
            var17 = td.a(var2, 115);
            String var18 = wta.a((byte)96, var2);
            Object[] var4;
            di.a((Object[])((Object[])var0[63]), true, (lm)((var4 = sg.a(var18, -19450, new Object[2])) == null?null:var4[1]), (long)var17);
         }
      }

      if(null != var0 && var0.length == 2 && var0[1].equals(Integer.valueOf(0))) {
         jna.a = 46;
      }

      var0[30] = hr.a(var2, (byte)-113, var0);
      var0[36] = hr.a(var2, (byte)-64, var0);
      var0[38] = hr.a(var2, (byte)-36, var0);
      var0[52] = hr.a(var2, (byte)-121, var0);
      var0[32] = hr.a(var2, (byte)-11, var0);
      var0[3] = hr.a(var2, (byte)-44, var0);
      var0[56] = hr.a(var2, (byte)-96, var0);
      var0[33] = hr.a(var2, (byte)-114, var0);
      var0[17] = hr.a(var2, (byte)-95, var0);
      var0[61] = hr.a(var2, (byte)-78, var0);
      if(0 <= var5) {
         var0[62] = hr.a(var2, (byte)-54, var0);
      }

      var0[41] = hr.a(var2, (byte)-56, var0);
      var0[14] = hr.a(var2, (byte)-74, var0);
      var0[22] = hr.a(var2, (byte)-70, var0);
      var0[10] = hr.a(var2, (byte)-115, var0);
      var0[55] = hr.a(var2, (byte)-98, var0);
      var0[18] = hr.a(var2, (byte)-125, var0);
      var0[40] = hr.a(var2, (byte)-14, var0);
      var0[54] = hr.a(var2, (byte)-34, var0);
      var0[46] = hr.a(var2, (byte)-7, var0);
      var0[42] = hr.a(var2, (byte)-15, var0);
      var0[23] = sna.a(var0, (byte)105, var2);
      var0[4] = sna.a(var0, (byte)104, var2);
      var0[27] = sna.a(var0, (byte)124, var2);
      var0[26] = sna.a(var0, (byte)110, var2);
      var0[37] = sna.a(var0, (byte)96, var2);
   }

   static final void a(Object[] var0, int var1, Object[] var2, int var3) {
      if(1 == var3) {
         ((int[])((int[])var0[1]))[5] = td.a(var2, 124);
         int var4 = ((int[])((int[])var0[1]))[5];
         double var5 = (double)(var4 >> 16 & 255) / 256.0D;
         double var7 = (double)((var4 & '\uff48') >> 8) / 256.0D;
         double var9 = (double)(255 & var4) / 256.0D;
         double var11 = var5;
         if(var5 > var7) {
            var11 = var7;
         }

         if(var11 > var9) {
            var11 = var9;
         }

         double var13 = var5;
         if(var7 > var5) {
            var13 = var7;
         }

         if(var9 > var13) {
            var13 = var9;
         }

         double var15 = 0.0D;
         double var17 = 0.0D;
         double var19 = (var13 + var11) / 2.0D;
         if(var11 != var13) {
            if(0.5D > var19) {
               var17 = (var13 - var11) / (var11 + var13);
            }

            if(var5 == var13) {
               var15 = (var7 - var9) / (-var11 + var13);
            } else if(var7 == var13) {
               var15 = (-var5 + var9) / (-var11 + var13) + 2.0D;
            } else if(var9 == var13) {
               var15 = (-var7 + var5) / (-var11 + var13) + 4.0D;
            }

            if(var19 >= 0.5D) {
               var17 = (var13 - var11) / (2.0D - var13 - var11);
            }
         }

         var15 /= 6.0D;
         ((int[])((int[])var0[1]))[3] = (int)(256.0D * var19);
         ((int[])((int[])var0[1]))[1] = (int)(256.0D * var17);
         if(((int[])((int[])var0[1]))[1] < 0) {
            ((int[])((int[])var0[1]))[1] = 0;
         } else if(((int[])((int[])var0[1]))[1] > 255) {
            ((int[])((int[])var0[1]))[1] = 255;
         }

         if(((int[])((int[])var0[1]))[3] >= 0) {
            if(((int[])((int[])var0[1]))[3] > 255) {
               ((int[])((int[])var0[1]))[3] = 255;
            }
         } else {
            ((int[])((int[])var0[1]))[3] = 0;
         }

         if(0.5D < var19) {
            ((int[])((int[])var0[1]))[6] = (int)(var17 * (-var19 + 1.0D) * 512.0D);
         } else {
            ((int[])((int[])var0[1]))[6] = (int)(512.0D * var17 * var19);
         }

         if(-2 < ~((int[])((int[])var0[1]))[6]) {
            ((int[])((int[])var0[1]))[6] = 1;
         }

         ((int[])((int[])var0[1]))[0] = (int)((double)((int[])((int[])var0[1]))[6] * var15);
      } else if(var3 != 2) {
         if(3 == var3) {
            ((int[])((int[])var0[1]))[4] = de.a((int)0, var2) << 2;
         } else if(var3 == 4) {
            ((boolean[])((boolean[])var0[0]))[1] = false;
         } else if(5 == var3) {
            ((boolean[])((boolean[])var0[0]))[0] = false;
         }
      } else {
         ((int[])((int[])var0[1]))[2] = de.a((int)0, var2);
         if(-65536 == ~((int[])((int[])var0[1]))[2]) {
            ((int[])((int[])var0[1]))[2] = -1;
         }
      }

      if(var1 != 40) {
         ((boolean[])((boolean[])var0[5]))[12] = true;
      }

      ++f;
   }

   static final boolean a(byte var0) {
      if(var0 > -44) {
         return true;
      } else {
         ++d;
         return 0 == dl.d?oc.c(-117, qs.h):true;
      }
   }

   static final boolean a(int var0, byte var1, int var2) {
      int var3 = 90 % ((var1 - 48) / 57);
      ++b;
      return an.a(var2, (byte)81, var0) & bw.a(var0, var2, (byte)124);
   }

   static final void a(Object[] var0, byte var1) {
      if(null == var0[1]) {
         var0[1] = new int[1];
      }

      if(var1 == -42) {
         ++c;
         if(null == var0[4]) {
            var0[4] = new byte[1];
         }

      }
   }

   static final int b(Object[] var0, byte var1) {
      ++h;
      if(var1 != 38) {
         a((Object[])null, (byte)-28);
      }

      return ((int[])((int[])var0[1]))[0];
   }

   static final void a(Object[] var0, int var1) {
      ++g;
      if(pt.d == ((int[])((int[])var0[1]))[var1]) {
         qma.d[((int[])((int[])var0[1]))[42]] = true;
      }

   }

   static final gv a(int var0, int var1, Canvas var2, Object[] var3, int var4) {
      ++a;
      if(var1 > -33) {
         a(new Object[0], (byte)107, new Object[0]);
      }

      Object[] var5;
      return (gv)(null != (var5 = oha.a(var3, var0, var2, false, -125, var4, new Object[8]))?var5[0]:null);
   }

   static final Object[] a(int var0, Object[] var1) {
      if(var0 != 1) {
         return (Object[])((Object[])var1[27]);
      } else {
         hia.a(var1, (byte)121);
         ++f_i;
         ((int[])((int[])var1[1]))[1] = -1;
         return var1;
      }
   }

}
