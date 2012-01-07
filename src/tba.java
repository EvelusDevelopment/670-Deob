import jaggl.OpenGL;
import java.io.IOException;

final class tba {

   static int d;
   static int a;
   static int h;
   static int g;
   static int b;
   static String c = "";
   static int[] f = new int[32];
   static Object[] e;


   static final void a(Object[] var0, byte var1) {
      ++g;
      Object[] var2 = (Object[])((Object[])((Object[])((Object[])var0[0]))[46]);
      if(!((boolean[])((boolean[])var0[8]))[3]) {
         OpenGL.glBindProgramARB('\u8620', ((int[])((int[])((Object[])((Object[])var0[0]))[1]))[36] != Integer.MAX_VALUE?((int[])((int[])((Object[])((Object[])var0[4]))[1]))[0]:((int[])((int[])((Object[])((Object[])var0[3]))[1]))[0]);
      } else {
         OpenGL.glBindProgramARB('\u8620', ((int[])((int[])((Object[])((Object[])var0[0]))[1]))[36] == Integer.MAX_VALUE?((int[])((int[])((Object[])((Object[])var0[7]))[1]))[0]:((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0]);
      }

      float var3 = (float)((int[])((int[])((Object[])((Object[])var0[0]))[1]))[36];
      float var4 = ((float[])((float[])var2[0]))[12] + var3 * ((float[])((float[])var2[0]))[4];
      float var5 = ((float[])((float[])var2[0]))[5] * var3 + ((float[])((float[])var2[0]))[13];
      float var6 = ((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[6] * var3;
      int var7 = -117 / ((var1 - 50) / 60);
      if(var0 != null && (var0.length == 27 || 1 == var0.length && var0[0].equals(Integer.valueOf(2)) && var0[0].equals(Integer.valueOf(2)))) {
         a(12, 16, -4947, new Object[1][]);
      }

      Class_e.e[2] = -((float[])((float[])var2[0]))[6];
      Class_e.e[1] = -((float[])((float[])var2[0]))[5];
      Class_e.e[0] = -((float[])((float[])var2[0]))[4];
      Class_e.e[3] = -(Class_e.e[1] * var5 + Class_e.e[0] * var4 + var6 * Class_e.e[2]);
      OpenGL.glProgramLocalParameter4fARB('\u8620', 1, Class_e.e[0], Class_e.e[1], Class_e.e[2], Class_e.e[3]);
      OpenGL.glEnable('\u8620');
      ((boolean[])((boolean[])var0[8]))[1] = true;
      iw.a(var0, true);
   }

   static final void b(Object[] var0, byte var1) {
      if(var1 < 53) {
         a((byte)-72);
      }

      ++d;
      if(null == var0[1]) {
         var0[1] = new int[2];
      }

      if(var0[3] == null) {
         var0[3] = new byte[1];
      }

   }

   static final void a(int var0, int var1, int var2, Object[] var3) {
      ++b;
      if(var2 != -4947) {
         a((Object[])null, (byte)-31);
      }

   }

   static final void a(byte var0) {
      if(tl.f != null) {
         try {
            tl.f.close();
         } catch (IOException var2) {
            ;
         }
      }

      ++a;
      tl.f = null;
      if(var0 != 76) {
         ((int[])((int[])e[7]))[6] = 25;
      }

   }

   static {
      int var0 = 2;

      for(int var1 = 0; 32 > var1; ++var1) {
         f[var1] = var0 - 1;
         var0 += var0;
      }

      e = sd.a(new Object[1], 17, (byte)112);
   }
}
