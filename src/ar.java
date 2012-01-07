import jaclib.memory.Stream;
import jaggl.OpenGL;

final class ar {

   static int d;
   static boolean c = false;
   static long g = -1L;
   static int e;
   static Object[][] b;
   static int a;
   static int f;


   static final void a(byte var0, Object[] var1) {
      ++e;
      int var2;
      if(((ta)var1[38]).E != null) {
         var2 = ((int[])((int[])var1[1]))[36] + ((int[])((int[])var1[1]))[16];
         int var3 = ((int[])((int[])var1[1]))[0] + ((ta)var1[38]).E.d() + -((int[])((int[])var1[1]))[26];
         int var4 = -((int[])((int[])var1[1]))[16] + ((int[])((int[])var1[1]))[2];
         int var5 = ((int[])((int[])var1[1]))[26] - ((int[])((int[])var1[1]))[1];
         if(0 > var4) {
            var4 = 0;
         }

         if(0 > var5) {
            var5 = 0;
         }

         OpenGL.glScissor(var2, var3, var4, var5);
      }

      var2 = 83 % ((var0 - 71) / 40);
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2) {
      ++d;
      var1[2] = var2;
      if(var1[5] == null) {
         var1[5] = new long[1];
      }

      if(var0 >= -6) {
         return (Object[])null;
      } else {
         ln.a(-28834, var1);
         kka.a(var1, (byte)49);
         return var1;
      }
   }

   static final ka a(boolean var0, int var1, Object[] var2, ta var3) {
      ++f;
      if(var2[16] != null && 0 == var3.d(((ka)var2[16]).va(), var1)) {
         return (ka)var2[16];
      } else {
         if(!var0) {
            a(((int[])((int[])var2[8]))[1], (Object[])((Object[])((Object[])((Object[])var2[3]))[2]));
         }

         Object[] var4 = oja.a(var2, var3, 0, var1, false);
         return var4 == null?null:(ka)var4[1];
      }
   }

   static final void a(int var0, Object[] var1) {
      var1[35] = ura.a(-78, new Object[2]);
      ++a;
      var1[49] = im.a(new Object[2], (int)-16365);
      var1[52] = ab.a(new Object[2], (byte)-110);
      var1[18] = im.a(new Object[2], (int)-16365);
      var1[7] = im.a(new Object[2], (int)-16365);
      var1[28] = ab.a(new Object[2], (byte)114);
      var1[3] = ab.a(new Object[2], (byte)-99);
      var1[13] = im.a(new Object[2], (int)-16365);
      var1[61] = ab.a(new Object[2], (byte)-90);
      var1[6] = im.a(new Object[2], (int)-16365);
      var1[42] = ab.a(new Object[2], (byte)112);
      var1[15] = ab.a(new Object[2], (byte)-45);
      var1[34] = nj.a(3, new Object[2]);
      ((boolean[])((boolean[])var1[63]))[9] = false;
      var1[2] = new float[4];
      var1[24] = kja.d;
      ((boolean[])((boolean[])var1[63]))[14] = false;
      var1[66] = ab.a(new Object[2], (byte)-28);
      var1[19] = ab.a(new Object[2], (byte)88);
      ((boolean[])((boolean[])var1[63]))[1] = false;
      var1[33] = ab.a(new Object[2], (byte)-33);
      var1[8] = ab.a(new Object[2], (byte)-56);
      var1[29] = var1[8];
      var1[26] = ab.a(new Object[2], (byte)127);
      var1[16] = ab.a(new Object[2], (byte)-113);
      var1[51] = ab.a(new Object[2], (byte)-127);
      ((int[])((int[])var1[1]))[25] = 0;
      ((float[])((float[])var1[0]))[12] = 1.0F;
      ((int[])((int[])var1[1]))[16] = 0;
      ((int[])((int[])var1[1]))[2] = 0;
      ((boolean[])((boolean[])var1[63]))[15] = false;
      var1[53] = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      var1[62] = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
      ((int[])((int[])var1[1]))[21] = 0;
      ((int[])((int[])var1[1]))[14] = 0;
      ((int[])((int[])var1[1]))[20] = 0;
      ((int[])((int[])var1[1]))[36] = 0;
      ((boolean[])((boolean[])var1[63]))[10] = false;
      ((float[])((float[])var1[0]))[7] = 50.0F;
      ((int[])((int[])var1[1]))[1] = 0;
      ((int[])((int[])var1[1]))[11] = 0;
      var1[60] = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      ((boolean[])((boolean[])var1[63]))[2] = false;
      ((int[])((int[])var1[1]))[13] = 0;
      ((boolean[])((boolean[])var1[63]))[3] = true;
      ((float[])((float[])var1[0]))[5] = 0.0F;
      ((float[])((float[])var1[0]))[1] = 1.0F;
      ((int[])((int[])var1[1]))[30] = 0;
      ((int[])((int[])var1[1]))[18] = 0;
      var1[5] = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      ((int[])((int[])var1[1]))[26] = 0;
      var1[14] = new float[6][4];
      ((float[])((float[])var1[0]))[14] = 3584.0F;
      ((float[])((float[])var1[0]))[6] = 0.0F;
      ((boolean[])((boolean[])var1[63]))[12] = false;
      ((boolean[])((boolean[])var1[63]))[0] = true;
      ((int[])((int[])var1[1]))[0] = 0;
      if(null != var1 && -20 == ~var1.length) {
         tna.a((Object[])((Object[])ota.z[0]), -13, (byte)44);
      }

      var1[var0] = new Object[2][];
      ((int[])((int[])var1[1]))[38] = 8;
      ((float[])((float[])var1[0]))[11] = 1.0F;
      ((int[])((int[])var1[1]))[22] = 0;
      ((int[])((int[])var1[1]))[15] = -1;
      ((int[])((int[])var1[1]))[5] = 3;
      ((boolean[])((boolean[])var1[63]))[20] = true;
      var1[72] = ib.e;
      ((boolean[])((boolean[])var1[63]))[6] = false;
      ((boolean[])((boolean[])var1[63]))[13] = true;
      ((int[])((int[])var1[1]))[3] = 16777215;
      ((boolean[])((boolean[])var1[63]))[8] = true;
      ((int[])((int[])var1[1]))[4] = -1;
      ((float[])((float[])var1[0]))[3] = 1.0F;
      var1[32] = new Object[16][];
      ((int[])((int[])var1[1]))[7] = 0;
      ((float[])((float[])var1[0]))[8] = -1.0F;
      ((float[])((float[])var1[0]))[2] = 1.0F;
      ((float[])((float[])var1[0]))[0] = -1.0F;
      ((boolean[])((boolean[])var1[63]))[18] = false;
      ((int[])((int[])var1[1]))[29] = 1;
      ((int[])((int[])var1[1]))[33] = 128;
      ((float[])((float[])var1[0]))[17] = 1.0F;
      new Stream();
      var1[44] = new hu[7];
      var1[11] = new hu[7];
      var1[48] = ab.a(new Object[2], (byte)-76);
      var1[47] = im.a(new Object[2], (int)-16365);
      ((int[])((int[])var1[1]))[19] = -1;
   }

}
