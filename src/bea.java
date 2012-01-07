import jaggl.OpenGL;
import java.nio.ByteBuffer;

final class bea {

   static int d;
   static int[] f = new int[13];
   static int b;
   static Object[] e;
   static int a;
   static int c;


   static final void b(Object[] var0, int var1, int var2) {
      ++d;
      if(null == var0) {
         if(var2 != 1) {
            ((boolean[])((boolean[])e[21]))[1] = true;
         }

         throw new IllegalStateException();
      } else {
         OpenGL.glUseProgram(0);
         nha.a((Object[])((Object[])var0[1]), 18806, 1);
         moa.a((byte)93, (Object[])null, (Object[])((Object[])var0[1]));
         nha.a((Object[])((Object[])var0[1]), var2 + 18805, 0);
      }
   }

   static final void a(int var0, int var1, Object[] var2) {
      int var3 = 115 % ((var0 - 53) / 41);
      OpenGL.glFramebufferRenderbufferEXT('\u8d40', var1, '\u8d41', ((int[])((int[])var2[1]))[0]);
      ++c;
   }

   static final void a(boolean var0, int var1, Object[] var2, int[] var3) {
      ((int[])((int[])var2[1]))[1] = -32768;
      ((int[])((int[])var2[1]))[3] = 0;
      ++b;
      ((int[])((int[])var2[1]))[0] = 32767;
      ByteBuffer var5 = (ByteBuffer)((Object[])((Object[])var2[8]))[57];
      if(!var0) {
         e = (Object[])null;
      }

      for(int var9 = 0; var1 > var9; ++var9) {
         int var7 = var3[var9];
         int var8 = ((int[])((int[])var2[0]))[var7];
         short[] var6 = ((short[][])((short[][])((Object[])((Object[])var2[3]))[4]))[var7];
         if(var8 != 0 && null != var6) {
            if(var2 != null && 5 == var2.length) {
               ud.a((Object[])null, 3, 71, -127, -33);
            }

            int var10 = 0;
            int var11 = 0;

            while(var6.length > var11) {
               if((1 << var10++ & var8) != 0) {
                  if(var2 != null && -13 == ~var2.length) {
                     return;
                  }

                  for(int var12 = 0; var12 < 3; ++var12) {
                     int var4 = var6[var11++] & '\uffff';
                     if(((int[])((int[])var2[1]))[0] > var4) {
                        ((int[])((int[])var2[1]))[0] = var4;
                     }

                     if(var4 > ((int[])((int[])var2[1]))[1]) {
                        ((int[])((int[])var2[1]))[1] = var4;
                     }

                     var5.putShort((short)var4);
                  }

                  ((int[])((int[])var2[1]))[3] += 3;
               } else {
                  var11 += 3;
               }
            }
         }
      }

   }

   static final void a(Object[] var0, int var1, int var2) {
      ++a;
      synchronized(var0[var1]) {
         fua.a(var1 ^ -95, (Object[])((Object[])var0[0]), var2);
      }

      synchronized(var0[2]) {
         fua.a(-48, (Object[])((Object[])var0[2]), var2);
      }
   }

}
