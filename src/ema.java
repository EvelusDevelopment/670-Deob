import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

final class ema {

   static int a;
   static int d;
   static int c;
   static int b;


   static final boolean a(int var0, int var1, Object[] var2, byte var3) {
      if(var3 != -29) {
         a((byte)123, (String)var2[5]);
      }

      ((int[])((int[])var2[1]))[1] = var1;
      ((byte[])((byte[])var2[5]))[0] = (byte)var0;
      ++b;
      if(((int[])((int[])var2[1]))[0] < ((int[])((int[])var2[1]))[1]) {
         int var5 = 8;
         byte var4;
         if(!((boolean[])((boolean[])var2[2]))[0]) {
            var4 = 1;
         } else {
            var4 = 0;
            var5 |= 512;
         }

         if(0L != ((long[])((long[])var2[4]))[0]) {
            IUnknown.Release(((long[])((long[])var2[4]))[0]);
         }

         ((long[])((long[])var2[4]))[0] = IDirect3DDevice.CreateVertexBuffer(((long[])((long[])((Object[])((Object[])var2[0]))[50]))[5], ((int[])((int[])var2[1]))[1], var5, 0, var4);
         ((int[])((int[])var2[1]))[0] = ((int[])((int[])var2[1]))[1];
      }

      return ((long[])((long[])var2[4]))[0] != 0L;
   }

   static final void a(float var0, float var1, float var2, int var3, Object[] var4, float var5) {
      ++a;
      if(var3 == 18534) {
         float var6 = var1 * var1;
         float var7 = var5 * var1;
         float var8 = var2 * var1;
         float var9 = var0 * var1;
         float var10 = var5 * var5;
         float var11 = var5 * var2;
         float var12 = var0 * var5;
         float var13 = var2 * var2;
         ((float[])((float[])var4[0]))[10] = -((var13 + var10) * 2.0F) + 1.0F;
         float var14 = var2 * var0;
         ((float[])((float[])var4[0]))[0] = (var7 - var14) * 2.0F;
         ((float[])((float[])var4[0]))[5] = (var7 + var14) * 2.0F;
         ((float[])((float[])var4[0]))[6] = (var12 + var8) * 2.0F;
         ((float[])((float[])var4[0]))[11] = (var11 - var9) * 2.0F;
         ((float[])((float[])var4[0]))[3] = 1.0F - (var13 + var6) * 2.0F;
         ((float[])((float[])var4[0]))[9] = 2.0F * (-var12 + var8);
         if(null != var4 && var4.length == 6) {
            kqa.a((Object[])null, true, (Object[])((Object[])bg.h[1]));
         }

         ((float[])((float[])var4[0]))[8] = 0.0F;
         ((float[])((float[])var4[0]))[1] = 0.0F;
         ((float[])((float[])var4[0]))[7] = 0.0F;
         ((float[])((float[])var4[0]))[2] = (var11 + var9) * 2.0F;
         ((float[])((float[])var4[0]))[4] = 1.0F - (var10 + var6) * 2.0F;
      }
   }

   static final void a(byte var0, String var1) {
      ++d;
      Object[] var2 = gqa.a(119);
      ek.putByte((Object[])((Object[])var2[0]), ((int[])((int[])dfa.m[0]))[0]);
      eda.putShort((Object[])((Object[])var2[0]), 0);
      if(var2 != null && (var2.length == 1 || -6 == ~var2.length)) {
         kt.a(true, -89, (byte)127, -9, ((int[])((int[])pt.b[25]))[0]);
      }

      int var3 = ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[0];
      eda.putShort((Object[])((Object[])var2[0]), 670);
      eda.putShort((Object[])((Object[])var2[0]), 1);
      int[] var4 = uw.b(var2, (byte)-107);
      int var5 = ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[0];
      bw.a(var1, (byte)0, (Object[])((Object[])var2[0]));
      ek.putByte((Object[])((Object[])var2[0]), dp.y);
      ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[0] += 7;
      mo.a(-7, ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[0], var4, var5, (Object[])((Object[])var2[0]));
      fp.a(-11399, (Object[])((Object[])var2[0]), ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[0] + -var3);
      if(var0 > -83) {
         a(0.6785905F, -0.8193943F, 0.86952555F, -50, (Object[])null, -1.0608897F);
      }

      lj.a(var2, 6, lba.h);
      pv.d = 0;
      opa.e = 163;
      tea.a = -3;
      cv.d = 0;
   }

   static final Object[] a(byte var0, Object[] var1) {
      if(null == var1[12]) {
         var1[12] = new int[46];
      }

      ++c;
      if(var0 < 72) {
         a((byte)-106, (String)null);
      }

      oj.a(var1, false, 10);
      mq.a((int)16364, var1);
      return var1;
   }

}
