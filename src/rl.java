
final class rl extends lm {

   Object[] o;
   static int m;
   static int n;
   static int q;
   static int s;
   static Object[] j = sd.a(new Object[1], 4, (byte)114);
   static Object[] r = nla.a(-22, new Object[0], 6);
   static Object[] k = ed.a(3, new Object[1], (byte)-103, 20);
   static int f_l;
   static boolean p = false;


   static final Object[] a(Object[] var0, int var1, int var2) {
      ++q;
      if(var2 != 0) {
         return (Object[])null;
      } else if(null != var0[2]) {
         if(null == var0[4]) {
            jm.a(var2 ^ -125, var0);
         }

         gp var3;
         return null == (var3 = (gp)pm.a((long)var1, (Object[])((Object[])var0[4]), false))?null:var3.q;
      } else {
         return null;
      }
   }

   rl(Object[] var1) {
      this.o = var1;
   }

   static final Object[] a(Object[] var0, int var1) {
      if(null == var0[8]) {
         var0[8] = new boolean[3];
      }

      ++f_l;
      if(var1 != 6) {
         a((Object[])null, (byte)116);
      }

      var0[6] = pq.a((int)14852, new Object[3]);
      var0[2] = pq.a(var1 ^ 14850, new Object[3]);
      ((boolean[])((boolean[])var0[8]))[1] = true;
      var0[5] = pq.a((int)14852, new Object[3]);
      ((boolean[])((boolean[])var0[8]))[2] = true;
      ab.a(new Object[2], (byte)-55);
      ab.a(new Object[2], (byte)-42);
      if(null != var0 && var0.length == 32) {
         return null;
      } else {
         var0[7] = im.a(new Object[2], (int)-16365);
         var0[1] = null;
         var0[3] = null;
         var0[4] = null;
         ((boolean[])((boolean[])var0[8]))[0] = true;
         fe var3 = new fe(var0);
         var0[0] = var3;
         return var0;
      }
   }

   static final int a(Object[] var0, byte var1) {
      if(null != var0 && (var0.length == 2 && var0[1].equals(Integer.valueOf(0)) || 3 == var0.length)) {
         dja.f = null;
      }

      ++m;
      if(!ev.a((int)4120, var0)) {
         return 0;
      } else {
         int var2 = 0;
         int var3 = 0;

         int var4;
         for(var4 = 0; ((Object[])((Object[])var0[5])).length > var4; ++var4) {
            if(((int[])((int[])((Object[])((Object[])var0[3]))[7]))[var4] > 0) {
               var2 += 100;
               var3 += kja.a(var4, -126, var0);
            }
         }

         if(var2 != 0) {
            var4 = var3 * 100 / var2;
            int var5 = -86 / ((80 - var1) / 44);
            return var4;
         } else {
            return 100;
         }
      }
   }

   static final void a(Object[] var0, float var1, int var2, float var3, float var4, float[] var5) {
      ++s;
      float var6 = ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[3] * var3 + var1 * ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[7] + var4 * ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[11];
      float var7 = ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[8] * var4 + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[0] * var3 + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[12] + var1 * ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[4];
      float var8 = var3 * ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[1] + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[5] * var1 + var4 * ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[9];
      var5[1] = ((float[])((float[])var0[25]))[4] + ((float[])((float[])var0[25]))[9] * var8 / var6;
      var5[0] = ((float[])((float[])var0[25]))[3] + ((float[])((float[])var0[25]))[0] * var7 / var6;
      float var9 = var1 * ((float[])((float[])((Object[])((Object[])var0[46]))[0]))[6] + ((float[])((float[])((Object[])((Object[])var0[46]))[0]))[14] + var3 * ((float[])((float[])((Object[])((Object[])var0[46]))[0]))[2] + var4 * ((float[])((float[])((Object[])((Object[])var0[46]))[0]))[var2];
      var5[2] = var9;
   }

   static final void a(int var0, Object[] var1, int var2) {
      if(var0 == 5) {
         ++n;
         Class_h.a(var1, 2);
         vw.a(vqa.j, (Object[])((Object[])var1[3]), var2 * 4, 0, 0, (byte)-118, var2 * 2);
      }
   }

}
