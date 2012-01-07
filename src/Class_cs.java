import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.io.IOException;

final class Class_cs {

   static int a;
   static int h;
   static int c;
   static int d;
   static int e;
   static int g;
   static int f;
   static int b;


   static final void a(int var0, long var1, Object[] var3, tha var4) {
      ++c;
      if(var4.r != null) {
         var4.a(8192);
      }

      tha var5 = ((tha[])((tha[])var3[2]))[(int)((long)(-1 + ((int[])((int[])var3[1]))[0]) & var1)];
      var4.s = var5;
      var4.r = var5.r;
      var4.r.s = var4;
      if(var0 < 108) {
         ((boolean[])((boolean[])var3[4]))[0] = true;
      }

      var4.s.r = var4;
      var4.m = var1;
   }

   static final void a(int var0, int var1, Object[] var2, int var3, int var4) {
      ++h;
      if(var0 >= -114) {
         e = -51;
      }

      if(var2[0] == null) {
         ((byte[])((byte[])((Object[])((Object[])var2[3]))[10]))[0] = ((byte[])((byte[])((Object[])((Object[])var2[3]))[10]))[1] = (byte)var3;
         ul.a(0, var4, (Object[])((Object[])var2[3]), var1);
      } else {
         el.a(var3, true, 123, var4, (Object[])((Object[])var2[0]), var1, dg.a(-100, (Object[])((Object[])var2[0])));
      }

   }

   static final void a(Object[] var0, boolean var1) throws IOException {
      ++g;
      if(var0 == null || 9 != var0.length) {
         if(!var1) {
            ((long[])((long[])var0[4]))[4] = ((long[])((long[])((Object[])((Object[])var0[28]))[0]))[15];
         }

         while(-2 != ~((OggStreamState)((Object[])((Object[])var0[3]))[2]).packetOut((OggPacket)var0[0])) {
            Object[] var2 = ke.a((int)-14100, var0);
            if(null == var2) {
               if(((boolean[])((boolean[])var0[7]))[3]) {
                  era.a(var0, (byte)-67);
               }

               return;
            }

            if(var0[6] == var2) {
               eba.a(var0, (byte)116);
            }
         }

         qk.a(1, (Object[])((Object[])var0[3]), (OggPacket)var0[0]);
      }
   }

   static final int a(Object[] var0, int var1, Object[] var2) {
      ++d;
      if(var1 != 3) {
         return 83;
      } else {
         for(int var3 = 0; ((Object[])((Object[])var0[3])).length > var3; ++var3) {
            if(((Object[][])((Object[][])var0[3]))[var3] == var2) {
               return var3;
            }
         }

         return -1;
      }
   }

   static final void a(float var0, float var1, float var2, Object[] var3, byte var4) {
      if(var4 != 125) {
         ((byte[])((byte[])((Object[])((Object[])var3[18]))[10]))[1] = ((byte[])((byte[])var3[5]))[17];
      }

      ((float[])((float[])var3[1]))[0] = var2;
      ((float[])((float[])var3[1]))[1] = var0;
      ((float[])((float[])var3[1]))[2] = var1;
      ++b;
   }

   static final void a(float var0, float[] var1, float var2, float var3, int var4, Object[] var5) {
      var1[2] = ((float[])((float[])var5[0]))[10] * var0 + ((float[])((float[])var5[0]))[2] * var3 + var2 * ((float[])((float[])var5[0]))[6];
      ++a;
      var1[1] = ((float[])((float[])var5[0]))[1] * var3 + ((float[])((float[])var5[0]))[5] * var2 + var0 * ((float[])((float[])var5[0]))[9];
      int var6 = 116 / ((-46 - var4) / 58);
      var1[0] = ((float[])((float[])var5[0]))[8] * var0 + ((float[])((float[])var5[0]))[0] * var3 + var2 * ((float[])((float[])var5[0]))[4];
      if(3 < var1.length) {
         var1[3] = var0 * ((float[])((float[])var5[0]))[11] + ((float[])((float[])var5[0]))[7] * var2 + ((float[])((float[])var5[0]))[3] * var3;
      }

   }

   static final Object[] a(byte var0, Object[] var1) {
      ++f;
      if(var0 <= 44) {
         e = 45;
      }

      return (Object[])((Object[])var1[0]);
   }

}
