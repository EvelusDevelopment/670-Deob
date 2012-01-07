import jaggl.OpenGL;
import java.awt.EventQueue;

final class fo {

   static int a;
   static ja e;
   static char[] k = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   static EventQueue d;
   static Object[] c = nb.a((byte)74, 4, new Object[5]);
   static int f_l;
   static int h;
   static int f;
   static long g = -1L;
   static int j;
   static Object[][][][] f_i;
   static int b;


   static final int a(byte var0, int var1) {
      ++f;
      int var6 = 45 / ((46 - var0) / 47);
      double var2 = (double)((16771147 & var1) >> 16) / 256.0D;
      double var4 = (double)((var1 & '\uffff') >> 8) / 256.0D;
      double var7 = (double)(var1 & 255) / 256.0D;
      double var9 = var2;
      if(var4 < var2) {
         var9 = var4;
      }

      if(var7 < var9) {
         var9 = var7;
      }

      double var11 = var2;
      if(var2 < var4) {
         var11 = var4;
      }

      if(var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = (var11 + var9) / 2.0D;
      if(var9 != var11) {
         if(var17 < 0.5D) {
            var15 = (-var9 + var11) / (var9 + var11);
         }

         if(var11 == var2) {
            var13 = (-var7 + var4) / (-var9 + var11);
         } else if(var4 == var11) {
            var13 = (-var2 + var7) / (-var9 + var11) + 2.0D;
         } else if(var11 == var7) {
            var13 = (-var4 + var2) / (-var9 + var11) + 4.0D;
         }

         if(0.5D <= var17) {
            var15 = (-var9 + var11) / (-var9 + -var11 + 2.0D);
         }
      }

      var13 /= 6.0D;
      int var19 = (int)(256.0D * var13);
      int var20 = (int)(var15 * 256.0D);
      if(0 > var20) {
         var20 = 0;
      } else if(var20 > 255) {
         var20 = 255;
      }

      int var21 = (int)(256.0D * var17);
      if(0 > var21) {
         var21 = 0;
      } else if(255 < var21) {
         var21 = 255;
      }

      if(243 >= var21) {
         if(217 < var21) {
            var20 >>= 3;
         } else if(var21 <= 192) {
            if(179 < var21) {
               var20 >>= 1;
            }
         } else {
            var20 >>= 2;
         }
      } else {
         var20 >>= 4;
      }

      return (var20 >> 5 << 7) + ((var19 & 255) >> 2 << 10) + (var21 >> 1);
   }

   static final void a(int var0, Object[] var1, int var2, int var3) {
      synchronized(var1) {
         if(var3 <= 17) {
            e = (ja)null;
         }

         Object[] var7 = ps.a((byte)-21, var2, new Object[2]);
         ((lm)(var7 == null?null:var7[0])).e = (long)var0;
         client.a(107, (Object[])((Object[])var1[89]), (lm)(var7 != null?var7[0]:null));
      }

      ++f_l;
   }

   static final void a(int var0, Object[] var1, boolean var2, int var3, boolean var4, Object[] var5) {
      ++a;
      int var6 = '\u8580' + var3;
      char var7;
      if(haa.b == var1) {
         var7 = 5890;
      } else if(pba.g == var1) {
         var7 = '\u8577';
      } else if(var1 == ug.a) {
         var7 = '\u8578';
      } else {
         if(var1 != pja.d) {
            throw new IllegalArgumentException();
         }

         var7 = '\u8576';
      }

      OpenGL.glTexEnvi(8960, var6, var7);
      if(!var2) {
         OpenGL.glTexEnvi(8960, '\u8590' + var3, var4?769:768);
      } else {
         OpenGL.glTexEnvi(8960, var3 + '\u8590', var4?771:770);
      }

      if(var0 != 5890) {
         ((int[])((int[])var5[23]))[5] = 70;
      }

   }

   static final boolean a(int var0, Object[] var1) {
      if(var0 <= 8) {
         a(126, ((int[])((int[])var1[0]))[2], -58, -22, ((int[])((int[])var1[0]))[8], ((boolean[])((boolean[])var1[2]))[6], ((int[])((int[])var1[13]))[2]);
      }

      ++j;
      return !se.a((Object[])((Object[])var1[0]), (byte)-122);
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      cja.g = var2;
      ++h;
      moa.g = var3;
      ks.c = var6;
      if(var0 > 97) {
         gha.f_i = var1;
         bqa.a = var4;
         if(var5 && bqa.a >= 100) {
            woa.M = 256 + ks.c * 512;
            pta.f = 512 * moa.g + 256;
            qt.e = Class_ds.a(jca.n, woa.M, pta.f, (byte)122) + -cja.g;
         }

         hh.b = -1;
         nca.a = -1;
         ha.e = 4;
      }
   }

}
