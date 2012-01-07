import jagdx.IDirect3DDevice;

final class dsa {

   static int d;
   static int a;
   static int c;
   static int b = 1;


   static final void a(int var0, Object[] var1) {
      if(((boolean[])((boolean[])var1[63]))[16]) {
         IDirect3DDevice.a(((long[])((long[])var1[50]))[5], 28, ((boolean[])((boolean[])var1[63]))[13] && ((boolean[])((boolean[])var1[63]))[4] && 0 <= ((int[])((int[])var1[1]))[4]);
      }

      ++d;
      int var2 = -61 % ((19 - var0) / 37);
   }

   static final void a(boolean var0, Object[] var1, byte var2) {
      if(var2 != -61) {
         b = -63;
      }

      ++a;
      if(null != var1 && 39 == var1.length) {
         label33: {
            if(!var0) {
               an.a((Object[])((Object[])var1[24]), (Object[])((Object[])var1[25]), true);
               if(client.f_vb == 0) {
                  break label33;
               }
            }

            an.a((Object[])((Object[])var1[19]), (Object[])((Object[])var1[25]), true);
         }

         rsa.a(-12423, (Object[])((Object[])var1[25]));
         mn.a((Object[])((Object[])var1[6]), (Object[])((Object[])var1[25]), (byte)74, 0, (Object[])((Object[])var1[31]));
         if(null == var1 || 4 != var1.length || !var1[0].equals(Integer.valueOf(2))) {
            vla.a((Object[])((Object[])var1[35]), true, (Object[])((Object[])var1[30]), (Object[])((Object[])var1[25]));
            kaa.a((Object[])((Object[])var1[9]), (Object[])((Object[])var1[25]), var2 ^ -114, (Object[])((Object[])var1[37]));
            fta.a((Object[])((Object[])var1[25]), ((float[])((float[])((Object[])((Object[])var1[10]))[0]))[0], (Object[])((Object[])var1[33]), ((float[])((float[])((Object[])((Object[])var1[10]))[0]))[1], ((float[])((float[])((Object[])((Object[])var1[10]))[0]))[2], (byte)21, ((float[])((float[])((Object[])((Object[])var1[10]))[0]))[3]);
            eea.a(((float[])((float[])((Object[])((Object[])var1[15]))[1]))[1], ((float[])((float[])((Object[])((Object[])var1[15]))[1]))[2], false, (Object[])((Object[])var1[28]), (Object[])((Object[])var1[25]), ((float[])((float[])((Object[])((Object[])var1[15]))[1]))[0]);
            fta.a((Object[])((Object[])var1[25]), ((float[])((float[])((Object[])((Object[])var1[12]))[0]))[0], (Object[])((Object[])var1[22]), ((float[])((float[])((Object[])((Object[])var1[12]))[0]))[1], ((float[])((float[])((Object[])((Object[])var1[12]))[0]))[2], (byte)21, ((float[])((float[])((Object[])((Object[])var1[12]))[0]))[3]);
            eea.a(((float[])((float[])((Object[])((Object[])var1[3]))[1]))[1], ((float[])((float[])((Object[])((Object[])var1[3]))[1]))[2], false, (Object[])((Object[])var1[23]), (Object[])((Object[])var1[25]), ((float[])((float[])((Object[])((Object[])var1[3]))[1]))[0]);
            fta.a((Object[])((Object[])var1[25]), 0.0F, (Object[])((Object[])var1[32]), 0.0F, 0.0F, (byte)21, 0.0F);
            vw.a(vqa.j, (Object[])((Object[])var1[8]), ((int[])((int[])var1[1]))[2], ((int[])((int[])var1[1]))[0], ((int[])((int[])var1[1]))[1], (byte)-123, ((int[])((int[])var1[1]))[3]);
         }
      } else if(var1 != null && 17 == var1.length) {
         sj.a((Object[])((Object[])var1[8]), (byte)106, (int)0);
         mb.a((Object[])((Object[])var1[8]), 13195, haa.b, 0);
         roa.a(haa.b, var2 ^ -96, (Object[])((Object[])var1[8]), 0);
         mb.a((Object[])((Object[])var1[8]), 13195, pba.g, 1);
         roa.a(pba.g, 80, (Object[])((Object[])var1[8]), 1);
         mqa.a((Object[])((Object[])var1[8]), Class_t.c, (byte)108, Class_t.c);
         oja.b(var1, 8);
      } else {
         throw new IllegalStateException();
      }
   }

}
