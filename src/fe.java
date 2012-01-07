import jaggl.OpenGL;

final class fe extends nj {

   static int p;
   static int f_i;
   static int f_l;
   Object[] m;
   static int k;
   static int j;
   static int q;
   static Object[] n = ho.a(-1, 90, new Object[1], true);
   static int[] o = new int[256];


   private final void a(byte var1) throws Throwable {
      ++f_i;
      super.finalize();
      if(var1 != -23) {
         a(13, (Object[])((Object[])n[3]), -120, -47, (Class_s)null, -88);
      }

   }

   static final void b(int var0, Object[] var1) {
      ++j;
      if(var1[var0] == null) {
         var1[4] = new int[4];
      }

   }

   fe(Object[] var1) {
      this.m = var1;
   }

   static final void a(int var0, Object[] var1, int var2, int var3, Class_s var4, int var5) {
      ++f_l;
      if(var0 != 2) {
         a(88, (Object[])((Object[])var1[27]), ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var1[1]))[1]))[21]))[5], -58, (Class_s)null, 42);
      }

   }

   static final void c(int var0, Object[] var1) {
      if(null == var1[var0]) {
         var1[1] = new int[2];
      }

      ++q;
   }

   protected final void finalize() throws Throwable {
      ++p;
      Object[] var1 = this.m;
      if(null != var1 && -44 == ~var1.length) {
         qg.a((byte)27, var1);
      } else if(null != var1 && 20 == var1.length && ((byte[])((byte[])var1[10])).length == 3) {
         if(var1[19] != null) {
            ((ch)var1[19]).d();
         }
      } else if(var1 != null && 24 == var1.length) {
         if(var1[18] != null) {
            ((ch)var1[18]).d();
         }
      } else {
         ((fe)var1[0]).a((byte)-23);
      }

   }

   static final void a(Object[] var0, int var1, int var2, byte var3) {
      ++k;
      if(var3 == 45) {
         if((var2 & 1) != 1) {
            if(!((boolean[])((boolean[])((Object[])((Object[])var0[1]))[5]))[0]) {
               moa.a((byte)95, ((Object[][])((Object[][])((Object[])((Object[])var0[1]))[3]))[0], (Object[])((Object[])var0[0]));
            } else {
               moa.a((byte)122, (Object[])((Object[])((Object[])((Object[])var0[1]))[4]), (Object[])((Object[])var0[0]));
               Class_fs.a[3] = 0.0F;
               Class_fs.a[0] = 0.0F;
               Class_fs.a[1] = 0.0F;
               Class_fs.a[2] = 0.0F;
               OpenGL.glTexGenfv(8194, 9473, Class_fs.a, 0);
            }
         } else if(!((boolean[])((boolean[])((Object[])((Object[])var0[1]))[5]))[0]) {
            int var4 = ((int[])((int[])((Object[])((Object[])var0[0]))[1]))[33] % 4000 * 16 / 4000;
            moa.a((byte)118, ((Object[][])((Object[][])((Object[])((Object[])var0[1]))[3]))[var4], (Object[])((Object[])var0[0]));
         } else {
            moa.a((byte)116, (Object[])((Object[])((Object[])((Object[])var0[1]))[4]), (Object[])((Object[])var0[0]));
            Class_fs.a[0] = 0.0F;
            Class_fs.a[1] = 0.0F;
            Class_fs.a[2] = 0.0F;
            Class_fs.a[3] = (float)(((int[])((int[])((Object[])((Object[])var0[0]))[1]))[33] % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, Class_fs.a, 0);
         }

      }
   }

}
