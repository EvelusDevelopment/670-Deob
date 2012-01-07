import jagdx.D3DLIGHT;
import jaggl.OpenGL;

final class kl implements re, lua {

   Object[] j;
   static int h;
   static Object[] f;
   static int k;
   static int d;
   static int c;
   static int f_i;
   static int a;
   static int e;
   static int b;
   static int g;


   static final Object[] a(boolean var0) {
      if(!var0) {
         return (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])f[7]))[11]))[2]);
      } else {
         ++a;
         return jka.a;
      }
   }

   kl(Object[] var1) {
      this.j = var1;
   }

   static final void a(byte var0, Object[] var1, int var2) {
      ++b;
      if(var0 == 35) {
         synchronized(var1[0]) {
            fua.a(var0 + 79, (Object[])((Object[])var1[0]), var2);
         }
      }
   }

   static final void a(Object[] var0, boolean var1) {
      ++h;
      if(var1) {
         if(((boolean[])((boolean[])var0[63]))[16]) {
            D3DLIGHT.SetDirection(((long[])((long[])var0[50]))[3], -((float[])((float[])var0[53]))[0], -((float[])((float[])var0[53]))[1], -((float[])((float[])var0[53]))[2]);
            D3DLIGHT.SetDirection(((long[])((long[])var0[50]))[2], -((float[])((float[])var0[62]))[0], -((float[])((float[])var0[62]))[1], -((float[])((float[])var0[62]))[2]);
            ((boolean[])((boolean[])var0[63]))[21] = false;
         }

      }
   }

   public final void a() {
      Class_h.b(this.j, 1);
      ++c;
   }

   public final int c() {
      ++d;
      return nc.a(this.j, 1794);
   }

   static final jia a(int var0, Object[] var1, qa var2) {
      ++f_i;
      if(var0 < 54) {
         f[0] = (Object)null;
      }

      return new jia(var1, var2);
   }

   static final void a(int var0, Object[] var1) {
      if(((boolean[])((boolean[])var1[8]))[1]) {
         OpenGL.glBindProgramARB('\u8620', 0);
         OpenGL.glDisable('\u8804');
         OpenGL.glDisable('\u8620');
         ((boolean[])((boolean[])var1[8]))[1] = false;
      }

      ++e;
      nha.a((Object[])((Object[])var1[0]), 18806, 1);
      if(var0 != 53) {
         a((Object[])((Object[])var1[0]), ((boolean[])((boolean[])((Object[])((Object[])var1[2]))[1]))[10]);
      }

      moa.a((byte)117, (Object[])null, (Object[])((Object[])var1[0]));
      el.a(8448, var0 + 30809, 8448, (Object[])((Object[])var1[0]));
      af.a(768, (Object[])((Object[])var1[0]), 30579, 5890, 0);
      af.a(770, (Object[])((Object[])var1[0]), 30579, '\u8576', 2);
      db.a(770, (Object[])((Object[])var1[0]), (byte)-68, 0, 5890);
      nha.a((Object[])((Object[])var1[0]), var0 + 18753, 0);
      if(((boolean[])((boolean[])var1[8]))[0]) {
         af.a(768, (Object[])((Object[])var1[0]), 30579, 5890, 0);
         db.a(770, (Object[])((Object[])var1[0]), (byte)-68, 0, 5890);
         ((boolean[])((boolean[])var1[8]))[0] = false;
      }

   }

   public final int b() {
      ++g;
      Object[] var2 = this.j;
      int var1 = ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[3];
      return var1;
   }

   static {
      Object[] var1 = new Object[0];
      f = var1;
      k = 0;
   }
}
