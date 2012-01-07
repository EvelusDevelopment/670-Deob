import jaggl.OpenGL;

final class nq extends tha {

   static Object[] x = sj.a(8, new Object[3], (byte)-29);
   static int y;
   Object[] u;
   static Object[] t = ed.a(10, new Object[1], (byte)-119, 66);
   static int v;
   static int w;


   static final void a(int var0, float var1, int var2, ta var3) {
      ++v;
      Class_b.f_i = var3;
      if(var2 < 114) {
         b((Object[])((Object[])((Object[])((Object[])t[1]))[2]), ((byte[])((byte[])t[1]))[0]);
      }

      mfa.g = Class_b.f_i.f();
      if(!Class_b.f_i.r()) {
         tr.e = Class_b.f_i.f();
      } else {
         tr.e = null;
      }

      kfa.b = var1;
      ns.j = var0;
      vk.c = 0;
      waa.c = 0;
      bla.b = true;
      kfa.a = (1.0F - kfa.b) / 2.0F;
      pq.a((byte)-58, vqa.n);
   }

   nq(Object[] var1) {
      this.u = var1;
   }

   static final void a(boolean var0, Object[] var1, int var2, byte var3, Object[] var4) {
      ++y;
      int var5 = 79 / ((39 - var3) / 48);
      if(var4 != null && 87 == var4.length) {
         qfa.a(var2, var0, var1, var4, -122);
      } else if(var4 != null && 91 == var4.length) {
         int var6 = var2 + '\u8588';
         char var7;
         if(haa.b == var1) {
            var7 = 5890;
         } else if(pba.g != var1) {
            if(var1 == ug.a) {
               var7 = '\u8578';
            } else {
               if(var1 != pja.d) {
                  throw new IllegalArgumentException();
               }

               var7 = '\u8576';
            }
         } else {
            var7 = '\u8577';
         }

         OpenGL.glTexEnvi(8960, var6, var7);
         OpenGL.glTexEnvi(8960, '\u8598' + var2, !var0?770:771);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void b(Object[] var0, byte var1) {
      if(((boolean[])((boolean[])var0[63]))[5]) {
         OpenGL.glEnable(3089);
      } else {
         OpenGL.glDisable(3089);
      }

      ++w;
      if(var1 < 112) {
         a(69, ((float[])((float[])var0[29]))[8], 119, (ta)((Object[])((Object[])x[6]))[2]);
      }

   }

}
