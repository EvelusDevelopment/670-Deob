import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

final class bka {

   static float e;
   static int b;
   static int d = 32;
   static int a = 0;
   static int c;


   static final void a(Object[] var0, byte var1, Object[] var2) {
      if(var1 <= 125) {
         a(1, (Object[])null, ((boolean[])((boolean[])((Object[])((Object[])var2[11]))[4]))[10], ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[5], (float[])((float[])var0[1]), (byte)65, (Object[])null);
      }

      ++b;
      float var3 = ((float[])((float[])var0[1]))[2];
      float var4 = ((float[])((float[])var0[1]))[0];
      ((float[])((float[])var0[1]))[2] = ((float[])((float[])var0[1]))[1] * ((float[])((float[])var2[0]))[6] + ((float[])((float[])var2[0]))[10] * var3 + var4 * ((float[])((float[])var2[0]))[0];
      ((float[])((float[])var0[1]))[0] = ((float[])((float[])var2[0]))[11] * ((float[])((float[])var0[1]))[1] + var3 * ((float[])((float[])var2[0]))[5] + var4 * ((float[])((float[])var2[0]))[3];
      ((float[])((float[])var0[1]))[1] = ((float[])((float[])var2[0]))[2] * var4 + ((float[])((float[])var2[0]))[9] * var3 + ((float[])((float[])var0[1]))[1] * ((float[])((float[])var2[0]))[4];
   }

   static final Object[] a(int var0, Object[] var1, boolean var2, int var3, float[] var4, byte var5, Object[] var6) {
      int var8 = -63 / ((var5 + 16) / 40);
      ++c;
      Object[] var7;
      if(null != var1 && var1.length == 87) {
         Object[] var11 = new Object[10];
         int var12 = 0;
         dka.a(2, var11);
         qb.a(vk.f, var11, var6, var2 && ((boolean[])((boolean[])var1[63]))[23], var3 * var0, -31470, var1);
         if(!((boolean[])((boolean[])((Object[])((Object[])var11[0]))[63]))[24]) {
            ((int[])((int[])var11[9]))[1] = fda.a(var0, (byte)81);
            ((int[])((int[])var11[9]))[0] = fda.a(var3, (byte)81);
         } else {
            ((int[])((int[])var11[9]))[0] = var3;
            ((int[])((int[])var11[9]))[1] = var0;
         }

         if(var2) {
            ((long[])((long[])var11[2]))[0] = IDirect3DDevice.CreateTexture(((long[])((long[])((Object[])((Object[])var11[0]))[50]))[5], ((int[])((int[])var11[9]))[1], ((int[])((int[])var11[9]))[0], 0, 1024, wg.a((byte)99, (Object[])((Object[])var11[4]), vk.h), 1);
         } else {
            ((long[])((long[])var11[2]))[0] = IDirect3DDevice.CreateTexture(((long[])((long[])((Object[])((Object[])var11[0]))[50]))[5], ((int[])((int[])var11[9]))[1], ((int[])((int[])var11[9]))[0], 1, 0, wg.a((byte)107, (Object[])((Object[])var11[4]), vk.h), 1);
         }

         if(var12 == 0) {
            var12 = var0;
         }

         ByteBuffer var13 = (ByteBuffer)((Object[])((Object[])var11[0]))[57];
         if(var11 != null && var11.length == 4 && var11[2].equals(Integer.valueOf(0)) && var11[2].equals(Integer.valueOf(1))) {
            wfa.a(20828, (Object[])null);
         }

         var13.clear();
         var13.asFloatBuffer().put(var4, 0, var3 * var12 * ((int[])((int[])((Object[])((Object[])var11[4]))[0]))[0]);
         IDirect3DTexture.Upload(((long[])((long[])var11[2]))[0], 0, 0, 0, var0, var3, var12 * ((int[])((int[])((Object[])((Object[])var11[4]))[0]))[0] * 4, 0, ((long[])((long[])((Object[])((Object[])var11[0]))[50]))[0]);
         var7 = var11;
      } else {
         if(var1 == null || 91 != var1.length) {
            throw new IllegalStateException();
         }

         var7 = dq.a(var4, var1, 0, (byte)16, var6, 0, var2, var3, var0);
      }

      return var7;
   }

}
