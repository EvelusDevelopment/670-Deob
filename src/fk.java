import java.awt.Canvas;
import java.awt.Graphics;

final class fk extends Canvas {

   static int a;
   static int f_i;
   static int g;
   private Object[] n;
   static int f_l;
   static int m;
   static int c;
   static int k;
   static int e;
   static int d;
   static int h;
   static Object[] o = nla.a(55, new Object[0], 7);
   static Object[] j;
   static Object[] f = ho.a(8, 16, new Object[1], true);
   static Object[] b = ed.a(-1, new Object[1], (byte)-123, 87);


   static final void b(byte var0, Object[] var1) {
      ++d;
      if(null == var1[1]) {
         var1[1] = new int[5];
      }

      if(var0 < 43) {
         a((Object[])null, -36, (ta)((Object[])((Object[])o[2]))[2]);
      }

   }

   static final void b(Object[] var0, int var1, ta var2) {
      if(var1 != 16) {
         b = (Object[])null;
      }

      ++f_l;
      ka var3 = qn.a(262144, var2, (Object[])((Object[])var0[14]), (byte)-55, true, true);
      if(null != var3) {
         tma.a((Object[])((Object[])var0[14]), 12, ((short[])((short[])var0[13]))[0], false, ((short[])((short[])var0[13]))[2], bra.a(var0, true), var3, ((short[])((short[])var0[13]))[1], var2, ((short[])((short[])var0[13]))[3]);
      }

   }

   static final Object[] a(String var0, int var1, Object[] var2) {
      ++a;
      if(var1 != 5846) {
         a((Object[])((Object[])var2[2]), ((int[])((int[])j[1]))[24], (ta)f[16]);
      }

      Object[] var3;
      byte[] var4;
      qta var5;
      if(null != var2 && var2.length == 87) {
         var4 = js.a(var0, 74, var2);
         if(null != var4) {
            var5 = cka.a(114, var4, var2);
            var3 = gka.a(var5, var2, new Object[9], var1 ^ 5840);
         } else {
            var3 = null;
         }

         return var3;
      } else if(null != var2 && 91 == var2.length) {
         var4 = taa.a(9, var0, var2);
         if(null == var4) {
            var3 = null;
         } else {
            var5 = cka.a(78, var4, var2);
            Object[] var7 = new Object[8];
            if(var7[1] == null) {
               var7[1] = new int[4];
            }

            ru.a(var5, var7, 1966, var2);
            var7[6] = var2;
            var3 = var7;
         }

         return var3;
      } else {
         throw new IllegalStateException();
      }
   }

   static final Object[] a(Object[] var0, int var1, ta var2) {
      ++g;
      if(null != var0[19]) {
         Object[] var3 = bra.a(var0, true);
         Object[] var4 = bva.a(-99, ((boolean[])((boolean[])var0[8]))[7]);
         ((ka)var0[19]).a(var3, ((lpa[])((lpa[])var0[9]))[0], 0);
         if(var1 < 68) {
            f = (Object[])null;
         }

         return var4;
      } else {
         return null;
      }
   }

   static final boolean a(int var0, int var1, byte var2) {
      ++e;
      boolean var3 = (var1 & 33) != 0;
      if(var2 < 68) {
         ((int[])((int[])j[1]))[4] = 116;
      }

      boolean var5 = (var1 & 34) != 0;
      boolean var6 = var5 | var3 | hda.a(var1, var0, 8);
      boolean var7 = 0 != (2048 & var1);
      return var7 & var6;
   }

   static final void a(int var0, int var1, Object[] var2, int var3) {
      ++k;
      float var4 = -5.0E-4F * (float)(1 + (3 & var3));
      float var5 = 5.0E-4F * (float)(1 + (3 & var3 >> 3));
      float var6 = (var1 & var3) == 0?4.8828125E-4F:9.765625E-4F;
      boolean var7 = -1 != ~(128 & var3);
      if(!var7) {
         ((float[])((float[])var2[30]))[3] = 0.0F;
         ((float[])((float[])var2[30]))[0] = 0.0F;
         ((float[])((float[])var2[30]))[1] = 0.0F;
         ((float[])((float[])var2[30]))[2] = var6;
      } else {
         ((float[])((float[])var2[30]))[1] = 0.0F;
         ((float[])((float[])var2[30]))[0] = var6;
         ((float[])((float[])var2[30]))[2] = 0.0F;
         ((float[])((float[])var2[30]))[3] = 0.0F;
      }

      ((float[])((float[])var2[34]))[1] = var6;
      ((float[])((float[])var2[34]))[3] = (float)((int[])((int[])((Object[])((Object[])var2[0]))[1]))[28] * var4 % 1.0F;
      ((float[])((float[])var2[34]))[2] = 0.0F;
      ((float[])((float[])var2[34]))[0] = 0.0F;
      if(!((boolean[])((boolean[])((Object[])((Object[])var2[25]))[0]))[0]) {
         int var8 = (int)((float)((int[])((int[])((Object[])((Object[])var2[0]))[1]))[28] * var5 * 16.0F);
         ah.a((Object[])((Object[])var2[0]), ((Object[][])((Object[][])((Object[])((Object[])var2[25]))[1]))[var8 % 16], (byte)88);
      } else {
         ((float[])((float[])var2[32]))[0] = (float)((double)var5 * (double)((int[])((int[])((Object[])((Object[])var2[0]))[1]))[28] % 1.0D);
      }

      if(null != var2 && -2 == ~var2.length) {
         a(-32, 64, (Object[])null, -59);
      }

   }

   public final void update(Graphics var1) {
      soa.a(8, this.n, var1);
      ++c;
   }

   public final void paint(Graphics var1) {
      ++h;
      uga.a((byte)90, this.n, var1);
   }

   static final void a(byte var0, Object[] var1) {
      int var2 = 116 % ((var0 - 26) / 51);
      ++m;
      if(var1[10] == null) {
         var1[10] = new byte[9];
      }

      if(null == var1[12]) {
         var1[12] = new int[58];
      }

      if(null == var1[8]) {
         var1[8] = new boolean[16];
      }

   }

   fk(Object[] var1) {
      this.n = var1;
   }

   static final Object[] a(int var0, int var1, boolean var2) {
      if(var0 != Integer.MIN_VALUE) {
         b((Object[])null, ((int[])((int[])b[2]))[11], (ta)null);
      }

      ++f_i;
      long var4 = (long)((var2?Integer.MIN_VALUE:0) | var1);
      lq var3;
      return null == (var3 = (lq)pm.a(var4, wp.c, false))?null:var3.r;
   }

}
