import java.awt.Component;
import javax.sound.sampled.SourceDataLine;

final class fla {

   static int c;
   static Object[] a = ura.a(-43, new Object[2]);
   static int b;


   static final void a(Object[] var0) {
      int var1 = 256;
      if(var0 != null && var0.length == 2 && var0[1].equals(Integer.valueOf(2)) && var0[1].equals(Boolean.valueOf(false))) {
         np.a((Component)null, (byte)92, (Object[])null);
      }

      if(df.g) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = ((int[])((int[])var0[2]))[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         ((byte[])((byte[])var0[8]))[var2 * 2] = (byte)(var3 >> 8);
         ((byte[])((byte[])var0[8]))[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      ((SourceDataLine)var0[9]).write((byte[])((byte[])var0[8]), 0, var1 << 1);
   }

   static final Object a(Object[] var0, int var1) {
      ++c;
      if(var1 != 2) {
         a((Object[])null);
      }

      return var0[2];
   }

   static final void a(Object[] var0, int var1, ta var2) {
      if(null != var0[5]) {
         Object[] var3 = (Object[])((Object[])woa.a(5, (Object[])((Object[])var0[2]))[1]);
         wg.a((ya)var0[5], ((byte[])((byte[])var0[4]))[1], (int)((float[])((float[])var3[1]))[2], (int)((float[])((float[])var3[1]))[1], (boolean[])((boolean[])var0[9]));
         var0[9] = null;
         var0[5] = null;
      }

      int var4 = -43 / ((var1 - 22) / 60);
      ++b;
   }

}
