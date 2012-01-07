import jaggl.OpenGL;

final class op {

   static int c;
   static int d;
   static int e;
   static Object[] a = sl.a("6", 0, new Object[1], "6");
   static int g;
   static int f;
   static Object[] h = lga.a(3, new Object[3], "game4", 1, "Game 4");
   static Object[] b = je.a(1, new Object[1], 8, (byte)-79);


   static final void a(int var0, Object[] var1, int var2, int var3) throws cr {
      try {
         ((ta)var1[55]).m.f();
      } catch (Exception var5) {
         ;
      }

      ++f;
      if(var0 != 19587) {
         a((Object[])null, (Object[])null, (byte)-66);
      }

   }

   static final void a(int var0, Object[] var1) {
      if(null == var1[var0]) {
         var1[1] = new int[15];
      }

      ++c;
      if(var1[8] == null) {
         var1[8] = new boolean[3];
      }

   }

   static final boolean b(int var0, Object[] var1) {
      if(var0 != 0) {
         return true;
      } else {
         ++e;
         return true;
      }
   }

   static final void putInt(Object[] var0, int var1) {
      ++d;
      byte[] var10000 = (byte[])((byte[])var0[2]);
      int[] var10001 = (int[])((int[])var0[1]);
      int var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      var10000[var10004] = (byte)(var1 >> 24);
      var10000 = (byte[])((byte[])var0[2]);
      var10001 = (int[])((int[])var0[1]);
      var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      var10000[var10004] = (byte)(var1 >> 16);
      var10000 = (byte[])((byte[])var0[2]);
      var10001 = (int[])((int[])var0[1]);
      var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      var10000[var10004] = (byte)(var1 >> 8);
      var10000 = (byte[])((byte[])var0[2]);
      var10001 = (int[])((int[])var0[1]);
      var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      var10000[var10004] = (byte)var1;
   }

   static final void a(Object[] var0, Object[] var1, byte var2) {
      lg.a((Object[])((Object[])var1[35]), var0, -18072);
      ++g;
      aqa.a(true, (Object[])((Object[])var1[35]), (Object[])((Object[])var1[46]));
      lg.a((Object[])((Object[])var1[37]), var0, -18072);
      if(var2 == 67) {
         kj.a(true, (Object[])((Object[])var1[37]));
         aqa.a(true, (Object[])((Object[])var1[37]), (Object[])((Object[])var1[11]));
         mra.b(var2 - 54, var1);
         if(((int[])((int[])var1[1]))[12] != 1) {
            OpenGL.glLoadIdentity();
            OpenGL.glMultMatrixf((float[])((float[])((Object[])((Object[])var1[46]))[0]), 0);
            if(((boolean[])((boolean[])var1[17]))[24]) {
               tba.a((Object[])((Object[])((Object[])((Object[])var1[12]))[4]), (byte)-50);
            }

            pga.a(var1, 0);
            sea.a(var1, (byte)-28);
         }

      }
   }

}
