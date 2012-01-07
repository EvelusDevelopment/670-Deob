
final class pfa {

   static int b;
   static int d;
   static int c;
   static int a;


   static final void a(int var0) {
      ++b;
      int var1 = mh.a(116, (Object[])((Object[])tu.d[7]));
      if(var1 != 0) {
         if(var1 != 1) {
            sd.a((byte)(-4 + OutputStreamWorker.c & 255), 0);
            ks.a(0, 2);
         } else {
            sd.a((byte)0, 0);
            ks.a(0, 512);
            if(pd.b != null) {
               jca.b((byte)-74);
            }
         }
      } else {
         fga.d = (byte[][][])null;
         ks.a(0, 0);
      }

      if(var0 == 4168) {
         ra.b = jca.n;
      }
   }

   static final boolean a(boolean var0, int var1, Object[] var2) {
      ++c;
      Object[] var4 = aua.a(23221, var2, var1);
      if(!var0) {
         a(((boolean[])((boolean[])var2[43]))[19], 11, (Object[])((Object[])var2[0]));
      }

      return null != var4 && pv.a(13, var4, (qa)(null == var2?null:var2[5]), (Object[])((Object[])var2[0]));
   }

   static final void a(int var0, Object[] var1, float var2, float var3, float var4) {
      ++d;
      if(null == var1 || 10 != var1.length) {
         ((float[])((float[])var1[0]))[11] = 0.0F;
         ((float[])((float[])var1[0]))[8] = var4;
         ((float[])((float[])var1[0]))[4] = 1.0F;
         ((float[])((float[])var1[0]))[5] = 0.0F;
         ((float[])((float[])var1[0]))[var0] = 0.0F;
         ((float[])((float[])var1[0]))[7] = var3;
         ((float[])((float[])var1[0]))[6] = 0.0F;
         ((float[])((float[])var1[0]))[10] = 1.0F;
         ((float[])((float[])var1[0]))[2] = 0.0F;
         ((float[])((float[])var1[0]))[3] = 1.0F;
         ((float[])((float[])var1[0]))[1] = var2;
         ((float[])((float[])var1[0]))[0] = 0.0F;
      }
   }

}
